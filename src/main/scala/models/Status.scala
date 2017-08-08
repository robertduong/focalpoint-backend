package models

sealed trait TaskStatus
case object TaskActive extends TaskStatus
case object TaskComplete extends TaskStatus

sealed trait ProjectStatus
case object ProjectComplete extends ProjectStatus
case object ProjectActive extends ProjectStatus
case object ProjectOnHold extends ProjectStatus
case object ProjectDropped extends ProjectStatus
