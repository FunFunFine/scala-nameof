package com.github.dwickern.macros.config

case class NameOfConfig(renaming: String => String) {
  def withRenaming(rename: String => String): NameOfConfig = copy(renaming = rename)
}

object NameOfConfig {
  def default: NameOfConfig = NameOfConfig(identity)
}
