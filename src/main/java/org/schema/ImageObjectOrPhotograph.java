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
class ImageObjectOrPhotograph {
  @JsonValue
  public Object getJsonLdValue() {
    if (myImageObject != null) return myImageObject;
    if (myPhotograph != null) return myPhotograph;
    return null;
  }
  public Thing getThing() {
    if (myImageObject != null) return myImageObject;
    if (myPhotograph != null) return myPhotograph;
    return null;
  }
  public void setImageObject(ImageObject imageObject) { clear(); myImageObject = imageObject; }
  public ImageObject getImageObject() { return myImageObject; }
  private ImageObject myImageObject;
  public void setPhotograph(Photograph photograph) { clear(); myPhotograph = photograph; }
  public Photograph getPhotograph() { return myPhotograph; }
  private Photograph myPhotograph;
  private void clear() {
    myImageObject = null;
    myPhotograph = null;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myImageObject != null ? myImageObject.hashCode() : 0);
    result = 31 * result + (myPhotograph != null ? myPhotograph.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ImageObjectOrPhotograph imageObjectOrPhotograph = (ImageObjectOrPhotograph) o;
    if (myImageObject != null ? !myImageObject.equals(imageObjectOrPhotograph.myImageObject) : imageObjectOrPhotograph.myImageObject != null) return false;
    if (myPhotograph != null ? !myPhotograph.equals(imageObjectOrPhotograph.myPhotograph) : imageObjectOrPhotograph.myPhotograph != null) return false;
    return true;
  }

}
