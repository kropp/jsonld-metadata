package org.schema.kotlin
import org.schema.Action
import org.schema.PriceSpecification
import org.schema.QuantitativeValue

class MutableUnitPriceSpecification {
  private val map = HashMap<String,Any>()
  var billingIncrement: Any by map
  var priceType: String by map
  var unitCode: String by map
  var unitText: String by map
  var referenceQuantity: QuantitativeValue by map
  fun referenceQuantity(builder: MutableQuantitativeValue.() -> Unit) { referenceQuantity = MutableQuantitativeValue().apply(builder).build() }
  var eligibleQuantity: QuantitativeValue by map
  fun eligibleQuantity(builder: MutableQuantitativeValue.() -> Unit) { eligibleQuantity = MutableQuantitativeValue().apply(builder).build() }
  var eligibleTransactionVolume: PriceSpecification by map
  fun eligibleTransactionVolume(builder: MutablePriceSpecification.() -> Unit) { eligibleTransactionVolume = MutablePriceSpecification().apply(builder).build() }
  var maxPrice: Any by map
  var minPrice: Any by map
  var price: Any by map
  var validFrom: java.util.Date by map
  var validThrough: java.util.Date by map
  var valueAddedTaxIncluded: Boolean by map
  var priceCurrency: String by map
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
  fun build() = org.schema.UnitPriceSpecification.Builder(map).build()
}
