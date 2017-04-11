package org.schema.kotlin
import org.schema.Action

class MutableInteractionCounter {
  private val map = HashMap<String,Any>()
  var interactionService: Any by map
  fun interactionServiceSoftwareApplication(builder: MutableSoftwareApplication.() -> Unit) { interactionService = MutableSoftwareApplication().apply(builder).build() }
  fun interactionServiceWebSite(builder: MutableWebSite.() -> Unit) { interactionService = MutableWebSite().apply(builder).build() }
  var interactionType: Action by map
  fun interactionType(builder: MutableAction.() -> Unit) { interactionType = MutableAction().apply(builder).build() }
  var userInteractionCount: Int by map
  var additionalType: String by map
  var alternateName: String by map
  var disambiguatingDescription: String by map
  var mainEntityOfPage: Any by map
  fun mainEntityOfPageCreativeWork(builder: MutableCreativeWork.() -> Unit) { mainEntityOfPage = MutableCreativeWork().apply(builder).build() }
  var name: String by map
  var sameAs: String by map
  var url: String by map
  var potentialAction: Action by map
  fun potentialAction(builder: MutableAction.() -> Unit) { potentialAction = MutableAction().apply(builder).build() }
  var id: String by map
  fun build() = org.schema.InteractionCounter.Builder(map).build()
}
