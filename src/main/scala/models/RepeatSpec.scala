package models

import org.joda.time.Duration

sealed trait RepeatSpec

case class RepeatEvery(duration: Either[Duration, (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean)]) extends RepeatSpec
case class DeferAnother(duration: Duration) extends RepeatSpec
case class DueAgain(duration: Duration) extends RepeatSpec

