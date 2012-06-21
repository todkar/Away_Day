import scala.actors.Actor
import scala.actors.Actor._

sealed abstract class Message
case class BusinessRequirement(objective: String) extends Message
case class Story(requirement: BusinessRequirement) extends Message
case class Code(story: Story) extends Message

class BusinessAnalyst(val developer: Developer) extends Actor {
  def act() {
    loop {
      react {
        case requirement: BusinessRequirement => analyze(requirement)
        case "stop" => goHome()
      }
    }
  }

  def analyze(requirement: BusinessRequirement) = {
    val story = Story(requirement)
    developer ! story
  }

  def goHome() = {
    developer ! "stop"
    exit()
  }
}

class Developer(val buildBox: BuildBox) extends Actor {
  def act() {
    loop {
      react {
        case story: Story => program(story)
        case "stop" => goHome()
      }
    }
  }

  def program(story: Story) = {
    val code = Code(story)
    buildBox ! code
  }

  def goHome() = {
    buildBox ! "stop"
    exit
  }
}

class BuildBox extends Actor {
  def act() {
    loop {
      react {
        case code: Code => deploy(code)
        case "stop" => exit()
      }
    }
  }

  def deploy(code: Code) = {
    val objective = code.story.requirement.objective
    println("The code for the business objective [" + objective + "] has now been deployed to production")
  }
}

val buildBox = new BuildBox
val developer = new Developer(buildBox)
val businessAnalyst = new BusinessAnalyst(developer)
buildBox.start
developer.start
businessAnalyst.start

val requirement = BusinessRequirement("To make the best bread in the world!")
businessAnalyst ! requirement
businessAnalyst ! "stop"
