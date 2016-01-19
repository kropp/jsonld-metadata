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
class MedicalDevicePurposeOrThing {
  @JsonValue
  public Object getJsonLdValue() {
    if (myMedicalDevicePurpose != null) return myMedicalDevicePurpose;
    if (myThing != null) return myThing;
    return null;
  }
  public void setMedicalDevicePurpose(MedicalDevicePurpose medicalDevicePurpose) { clear(); myMedicalDevicePurpose = medicalDevicePurpose; }
  public MedicalDevicePurpose getMedicalDevicePurpose() { return myMedicalDevicePurpose; }
  private MedicalDevicePurpose myMedicalDevicePurpose;
  public void setThing(Thing thing) { clear(); myThing = thing; }
  public Thing getThing() { return myThing; }
  private Thing myThing;
  private void clear() {
    myMedicalDevicePurpose = null;
    myThing = null;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myMedicalDevicePurpose != null ? myMedicalDevicePurpose.hashCode() : 0);
    result = 31 * result + (myThing != null ? myThing.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MedicalDevicePurposeOrThing medicalDevicePurposeOrThing = (MedicalDevicePurposeOrThing) o;
    if (myMedicalDevicePurpose != null ? !myMedicalDevicePurpose.equals(medicalDevicePurposeOrThing.myMedicalDevicePurpose) : medicalDevicePurposeOrThing.myMedicalDevicePurpose != null) return false;
    if (myThing != null ? !myThing.equals(medicalDevicePurposeOrThing.myThing) : medicalDevicePurposeOrThing.myThing != null) return false;
    return true;
  }

}
