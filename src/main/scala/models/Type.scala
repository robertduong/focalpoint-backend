package models

sealed trait Type
case object ParallelType extends Type
case object SequentialType extends Type