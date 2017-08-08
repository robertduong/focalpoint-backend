package factories

import models._
import org.joda.time.DateTime

object TaskFactory {
  private var id = 0

  def createTask(title: String, notes: String, actionType: Type): Task = {
    val timeDetails = TimeDetails(addDate = DateTime.now, changeDate = DateTime.now)
    val details = new Details(title, notes, actionType, timeDetails, false, None)
    Task(nextId.toString, details, TaskActive, Nil)
  }

  private def nextId: Int = {
    id += 1
    id
  }
}
