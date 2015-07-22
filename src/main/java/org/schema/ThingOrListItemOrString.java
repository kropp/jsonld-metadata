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

class ThingOrListItemOrString {
  public void setThing(Thing thing) { clear(); myThing = thing; }
  public Thing getThing() { return myThing; }
  private Thing myThing;
  public void setListItem(ListItem listItem) { clear(); myListItem = listItem; }
  public ListItem getListItem() { return myListItem; }
  private ListItem myListItem;
  public void setString(String value) { clear(); myString = value; }
  public String getString() { return myString; }
  private String myString;
  private void clear() {
    myThing = null;
    myListItem = null;
    myString = null;
  }
}
