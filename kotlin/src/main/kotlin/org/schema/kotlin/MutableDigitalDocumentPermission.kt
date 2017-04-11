package org.schema.kotlin
import org.schema.Action
import org.schema.DigitalDocumentPermissionType

class MutableDigitalDocumentPermission {
  private val map = HashMap<String,Any>()
  var grantee: Any by map
  fun granteeAudience(builder: MutableAudience.() -> Unit) { grantee = MutableAudience().apply(builder).build() }
  fun granteeContactPoint(builder: MutableContactPoint.() -> Unit) { grantee = MutableContactPoint().apply(builder).build() }
  fun granteeOrganization(builder: MutableOrganization.() -> Unit) { grantee = MutableOrganization().apply(builder).build() }
  fun granteePerson(builder: MutablePerson.() -> Unit) { grantee = MutablePerson().apply(builder).build() }
  var permissionType: DigitalDocumentPermissionType by map
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
  fun build() = org.schema.DigitalDocumentPermission.Builder(map).build()
}
