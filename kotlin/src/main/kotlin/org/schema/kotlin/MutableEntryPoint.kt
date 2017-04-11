package org.schema.kotlin
import org.schema.Action
import org.schema.SoftwareApplication

class MutableEntryPoint {
  private val map = HashMap<String,Any>()
  var actionPlatform: String by map
  var httpMethod: String by map
  var encodingType: String by map
  var contentType: String by map
  var actionApplication: SoftwareApplication by map
  fun actionApplication(builder: MutableSoftwareApplication.() -> Unit) { actionApplication = MutableSoftwareApplication().apply(builder).build() }
  var urlTemplate: String by map
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
  fun build() = org.schema.EntryPoint.Builder(map).build()
}
