/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.http.gson;

import java.lang.reflect.Type;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.yetus.audience.InterfaceAudience;
import org.apache.hbase.thirdparty.com.google.gson.JsonElement;
import org.apache.hbase.thirdparty.com.google.gson.JsonPrimitive;
import org.apache.hbase.thirdparty.com.google.gson.JsonSerializationContext;
import org.apache.hbase.thirdparty.com.google.gson.JsonSerializer;

/**
 * Serialize a {@code byte[]} using {@link Bytes#toString()}.
 */
@InterfaceAudience.Private
public final class ByteArraySerializer implements JsonSerializer<byte[]> {

  @Override
  public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
    return new JsonPrimitive(Bytes.toString(src));
  }
}
