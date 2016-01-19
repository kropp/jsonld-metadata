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
class ItemListOrMusicRecording {
  @JsonValue
  public Object getJsonLdValue() {
    if (myItemList != null) return myItemList;
    if (myMusicRecording != null) return myMusicRecording;
    return null;
  }
  public Thing getThing() {
    if (myItemList != null) return myItemList;
    if (myMusicRecording != null) return myMusicRecording;
    return null;
  }
  public void setItemList(ItemList itemList) { clear(); myItemList = itemList; }
  public ItemList getItemList() { return myItemList; }
  private ItemList myItemList;
  public void setMusicRecording(MusicRecording musicRecording) { clear(); myMusicRecording = musicRecording; }
  public MusicRecording getMusicRecording() { return myMusicRecording; }
  private MusicRecording myMusicRecording;
  private void clear() {
    myItemList = null;
    myMusicRecording = null;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myItemList != null ? myItemList.hashCode() : 0);
    result = 31 * result + (myMusicRecording != null ? myMusicRecording.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ItemListOrMusicRecording itemListOrMusicRecording = (ItemListOrMusicRecording) o;
    if (myItemList != null ? !myItemList.equals(itemListOrMusicRecording.myItemList) : itemListOrMusicRecording.myItemList != null) return false;
    if (myMusicRecording != null ? !myMusicRecording.equals(itemListOrMusicRecording.myMusicRecording) : itemListOrMusicRecording.myMusicRecording != null) return false;
    return true;
  }

}
