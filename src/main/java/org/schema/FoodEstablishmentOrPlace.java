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
class FoodEstablishmentOrPlace {
  @JsonValue
  public Object getJsonLdValue() {
    if (myFoodEstablishment != null) return myFoodEstablishment;
    if (myPlace != null) return myPlace;
    return null;
  }
  public Thing getThing() {
    if (myFoodEstablishment != null) return myFoodEstablishment;
    if (myPlace != null) return myPlace;
    return null;
  }
  public void setFoodEstablishment(FoodEstablishment foodEstablishment) { clear(); myFoodEstablishment = foodEstablishment; }
  public FoodEstablishment getFoodEstablishment() { return myFoodEstablishment; }
  private FoodEstablishment myFoodEstablishment;
  public void setPlace(Place place) { clear(); myPlace = place; }
  public Place getPlace() { return myPlace; }
  private Place myPlace;
  private void clear() {
    myFoodEstablishment = null;
    myPlace = null;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myFoodEstablishment != null ? myFoodEstablishment.hashCode() : 0);
    result = 31 * result + (myPlace != null ? myPlace.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FoodEstablishmentOrPlace foodEstablishmentOrPlace = (FoodEstablishmentOrPlace) o;
    if (myFoodEstablishment != null ? !myFoodEstablishment.equals(foodEstablishmentOrPlace.myFoodEstablishment) : foodEstablishmentOrPlace.myFoodEstablishment != null) return false;
    if (myPlace != null ? !myPlace.equals(foodEstablishmentOrPlace.myPlace) : foodEstablishmentOrPlace.myPlace != null) return false;
    return true;
  }

}
