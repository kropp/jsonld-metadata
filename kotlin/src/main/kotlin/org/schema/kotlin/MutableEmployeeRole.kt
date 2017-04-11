package org.schema.kotlin
import org.schema.Action

class MutableEmployeeRole {
  private val map = HashMap<String,Any>()
  var salaryCurrency: String by map
  var numberedPosition: Any by map
  var startDate: java.util.Date by map
  var roleName: String by map
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
  fun build() = org.schema.EmployeeRole.Builder(map).build()
}
