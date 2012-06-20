import scala.actors.Actor
import scala.actors.Actor._

case class BusinessRequirement(objective: String)

class BusinessAnalyst(val name: String) extends Actor {
  def act() {
    loop {
      react {
        // case requirement: BusinessRequirement => analyze(requirement)
        case BusinessRequirement(objective) => println(objective)
        case "STOP" => exit()
      }
    }
  }

  def analyze(requirement: BusinessRequirement) = {
    println(requirement.objective)
  }
}

object ProductOwner extends App {
  val requirement = BusinessRequirement("To make the best bread in the world!")
  val ba1 = new BusinessAnalyst("ba1")
  ba1.start
  ba1 ! requirement
  ba1 ! "STOP"
}
