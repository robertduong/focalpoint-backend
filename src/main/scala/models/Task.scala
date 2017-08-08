package models

import org.joda.time.DateTime

case class Details(
    title: String,
    notes: String,
    actionType: Type,
    timeInstance: TimeDetails,
    flagged: Boolean,
    repeat: Option[RepeatSpec]
)

case class Task(id: String, details: Details, status: TaskStatus, subtasks: List[Task])
case class Project(id: String, details: Details, status: ProjectStatus, tasks: List[Task])

case class TimeDetails(
    deferDate: Option[DateTime] = None,
    dueDate: Option[DateTime] = None,
    completeDate: Option[DateTime] = None,
    addDate: DateTime,
    changeDate: DateTime
)

