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

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy {
  void setAnatomicalStructure(AnatomicalStructure anatomicalStructure) { clear(); myAnatomicalStructure = anatomicalStructure; }
  public AnatomicalStructure getAnatomicalStructure() { return myAnatomicalStructure; }
  void setAnatomicalSystem(AnatomicalSystem anatomicalSystem) { clear(); myAnatomicalSystem = anatomicalSystem; }
  public AnatomicalSystem getAnatomicalSystem() { return myAnatomicalSystem; }
  void setSuperficialAnatomy(SuperficialAnatomy superficialAnatomy) { clear(); mySuperficialAnatomy = superficialAnatomy; }
  public SuperficialAnatomy getSuperficialAnatomy() { return mySuperficialAnatomy; }
  @com.fasterxml.jackson.annotation.JsonValue public Object getJsonLdValue() {
    if (myAnatomicalStructure != null) return myAnatomicalStructure;
    if (myAnatomicalSystem != null) return myAnatomicalSystem;
    if (mySuperficialAnatomy != null) return mySuperficialAnatomy;
    return null;
  }
  public Thing getThing() {
    if (myAnatomicalStructure != null) return myAnatomicalStructure;
    if (myAnatomicalSystem != null) return myAnatomicalSystem;
    if (mySuperficialAnatomy != null) return mySuperficialAnatomy;
    return null;
  }
  public void clear() {
    myAnatomicalStructure = null;
    myAnatomicalSystem = null;
    mySuperficialAnatomy = null;
  }
  @Override public int hashCode() {
    int result = 0;
    result = 31 * result + (myAnatomicalStructure != null ? myAnatomicalStructure.hashCode() : 0);
    result = 31 * result + (myAnatomicalSystem != null ? myAnatomicalSystem.hashCode() : 0);
    result = 31 * result + (mySuperficialAnatomy != null ? mySuperficialAnatomy.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy anatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy = (AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy) o;
    if (myAnatomicalStructure != null ? !myAnatomicalStructure.equals(anatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy.myAnatomicalStructure) : anatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy.myAnatomicalStructure != null) return false;
    if (myAnatomicalSystem != null ? !myAnatomicalSystem.equals(anatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy.myAnatomicalSystem) : anatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy.myAnatomicalSystem != null) return false;
    if (mySuperficialAnatomy != null ? !mySuperficialAnatomy.equals(anatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy.mySuperficialAnatomy) : anatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy.mySuperficialAnatomy != null) return false;
    return true;
  }
  private AnatomicalStructure myAnatomicalStructure;
  private AnatomicalSystem myAnatomicalSystem;
  private SuperficialAnatomy mySuperficialAnatomy;
}
