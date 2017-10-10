import info.mukel.telegrambot4s.api.declarative.Commands
import info.mukel.telegrambot4s.api.{Polling, TelegramBot}

object GeoBot extends TelegramBot with Polling with Commands{
  override def token: String = "440713715:AAERaCMDkgaLBLKrjBK2dNuFWcFqNUwrcPM"

  onCommand("/start") { implicit  msg =>
    val name = msg.from match {
      case Some(user) => user.username.getOrElse("")
      case _ => ""
    }
    reply(s"Привет, $name!")
  }
}
