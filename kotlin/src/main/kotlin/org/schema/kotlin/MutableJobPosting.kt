package org.schema.kotlin
import org.schema.Action
import org.schema.Organization
import org.schema.Place

class MutableJobPosting {
  private val map = HashMap<String,Any>()
  var baseSalary: Any by map
  var jobBenefits: String by map
  var datePosted: java.util.Date by map
  var educationRequirements: String by map
  var employmentType: String by map
  var experienceRequirements: String by map
  var hiringOrganization: Organization by map
  fun hiringOrganization(builder: MutableOrganization.() -> Unit) { hiringOrganization = MutableOrganization().apply(builder).build() }
  var incentiveCompensation: String by map
  var industry: String by map
  var jobLocation: Place by map
  fun jobLocation(builder: MutablePlace.() -> Unit) { jobLocation = MutablePlace().apply(builder).build() }
  var occupationalCategory: String by map
  var qualifications: String by map
  var responsibilities: String by map
  var salaryCurrency: String by map
  var skills: String by map
  var specialCommitments: String by map
  var title: String by map
  var validThrough: java.util.Date by map
  var workHours: String by map
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
  fun build() = org.schema.JobPosting.Builder(map).build()
}
