/*
 * Copyright 2015 JetBrains s.r.o.
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
 * Generated on Jul 22, 2015.
 */

package org.schema;

class AnatomicalSystemOrAnatomicalStructure {
  public Thing getThing() {
    if (myAnatomicalSystem != null) return myAnatomicalSystem;
    if (myAnatomicalStructure != null) return myAnatomicalStructure;
    return null;
  }
  public void setAnatomicalSystem(AnatomicalSystem anatomicalSystem) { clear(); myAnatomicalSystem = anatomicalSystem; }
  public AnatomicalSystem getAnatomicalSystem() { return myAnatomicalSystem; }
  private AnatomicalSystem myAnatomicalSystem;
  public void setAnatomicalStructure(AnatomicalStructure anatomicalStructure) { clear(); myAnatomicalStructure = anatomicalStructure; }
  public AnatomicalStructure getAnatomicalStructure() { return myAnatomicalStructure; }
  private AnatomicalStructure myAnatomicalStructure;
  private void clear() {
    myAnatomicalSystem = null;
    myAnatomicalStructure = null;
  }
}
