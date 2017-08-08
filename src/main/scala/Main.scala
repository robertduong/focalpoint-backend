import factories.TaskFactory
import models.{ParallelType, Task, TaskActive, TaskComplete}

object Main {


  def main(args: Array[String]): Unit = {
    val task = TaskFactory.createTask("Do this", "Some notes\nYeah", ParallelType)
    print(task)
  }

  def print(task: Task): Unit = {
    val status = task.status match {
      case TaskActive => " "
      case TaskComplete => "x"
    }
    System.out.print("[" + status + "]")
    println(task.details.title)
    1 to task.details.title.length()+3 foreach { _ => System.out.print("-") }
    println("")
    println(task.details.notes)
    1 to task.details.title.length()+3 foreach { _ => System.out.print("-") }
    println("")
    println("Defer date: " + task.details.timeInstance.deferDate.getOrElse("-"))
    println("Due date: " + task.details.timeInstance.dueDate.getOrElse("-"))
    println("Add date: " + task.details.timeInstance.addDate)
  }
}
