/*
 * Copyright 2015-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This is auto-generated file. Do not edit.
 */

package org.schema;

import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.*;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
class PlaceOrPostalAddressOrString {
  @JsonValue
  public Object getJsonLdValue() {
    if (myPlace != null) return myPlace;
    if (myPostalAddress != null) return myPostalAddress;
    if (myString != null) return myString;
    return null;
  }
  public void setPlace(Place place) { clear(); myPlace = place; }
  public Place getPlace() { return myPlace; }
  private Place myPlace;
  public void setPostalAddress(PostalAddress postalAddress) { clear(); myPostalAddress = postalAddress; }
  public PostalAddress getPostalAddress() { return myPostalAddress; }
  private PostalAddress myPostalAddress;
  public void setString(String value) { clear(); myString = value; }
  public String getString() { return myString; }
  private String myString;
  private void clear() {
    myPlace = null;
    myPostalAddress = null;
    myString = null;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myPlace != null ? myPlace.hashCode() : 0);
    result = 31 * result + (myPostalAddress != null ? myPostalAddress.hashCode() : 0);
    result = 31 * result + (myString != null ? myString.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PlaceOrPostalAddressOrString placeOrPostalAddressOrString = (PlaceOrPostalAddressOrString) o;
    if (myPlace != null ? !myPlace.equals(placeOrPostalAddressOrString.myPlace) : placeOrPostalAddressOrString.myPlace != null) return false;
    if (myPostalAddress != null ? !myPostalAddress.equals(placeOrPostalAddressOrString.myPostalAddress) : placeOrPostalAddressOrString.myPostalAddress != null) return false;
    if (myString != null ? !myString.equals(placeOrPostalAddressOrString.myString) : placeOrPostalAddressOrString.myString != null) return false;
    return true;
  }

}
