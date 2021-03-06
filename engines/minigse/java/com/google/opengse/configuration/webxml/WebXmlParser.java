// Copyright 2008 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.opengse.configuration.webxml;

import com.google.opengse.configuration.WebAppConfiguration;

import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.Reader;

/**
 * Implementors of this interface know how to parse a WEB-INF/web.xml file
 * and return a WebAppConfiguration.
 *
 * @author Mike Jennings
 */
public interface WebXmlParser {

  /**
   * Parse an XML document that conforms to at least the
   * <a href="http://java.sun.com/dtd/web-app_2_3.dtd">2.3 web.xml format</a>.
   */
  WebAppConfiguration parse(Reader webXml) throws IOException, SAXException;
}
