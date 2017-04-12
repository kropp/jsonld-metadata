package org.schema.kotlin
import org.schema.Action
import org.schema.SoftwareApplication

class MutableEntryPoint {
  private val map = HashMap<String,Any>()
  var actionPlatform: String
    get() = map["actionPlatform"] as String
    set(value) { map["actionPlatform"] = value }
  var httpMethod: String
    get() = map["httpMethod"] as String
    set(value) { map["httpMethod"] = value }
  var encodingType: String
    get() = map["encodingType"] as String
    set(value) { map["encodingType"] = value }
  var contentType: String
    get() = map["contentType"] as String
    set(value) { map["contentType"] = value }
  var actionApplication: SoftwareApplication
    get() = map["actionApplication"] as SoftwareApplication
    set(value) { map["actionApplication"] = value }
  fun actionApplication(builder: MutableSoftwareApplication.() -> Unit) { map["actionApplication"] = MutableSoftwareApplication().apply(builder).build() }
  var urlTemplate: String
    get() = map["urlTemplate"] as String
    set(value) { map["urlTemplate"] = value }
  var additionalType: String
    get() = map["additionalType"] as String
    set(value) { map["additionalType"] = value }
  var alternateName: String
    get() = map["alternateName"] as String
    set(value) { map["alternateName"] = value }
  var disambiguatingDescription: String
    get() = map["disambiguatingDescription"] as String
    set(value) { map["disambiguatingDescription"] = value }
  var mainEntityOfPage: Any
    get() = map["mainEntityOfPage"]!!
    set(value) { map["mainEntityOfPage"] = value }
  fun mainEntityOfPageCreativeWork(builder: MutableCreativeWork.() -> Unit) { map["mainEntityOfPage"] = MutableCreativeWork().apply(builder).build() }
  var name: String
    get() = map["name"] as String
    set(value) { map["name"] = value }
  var sameAs: String
    get() = map["sameAs"] as String
    set(value) { map["sameAs"] = value }
  var url: String
    get() = map["url"] as String
    set(value) { map["url"] = value }
  var potentialAction: Action
    get() = map["potentialAction"] as Action
    set(value) { map["potentialAction"] = value }
  fun potentialAction(builder: MutableAction.() -> Unit) { map["potentialAction"] = MutableAction().apply(builder).build() }
  var id: String
    get() = map["id"] as String
    set(value) { map["id"] = value }
  fun build() = org.schema.EntryPoint.Builder(map).build()
}
