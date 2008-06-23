/*
    This file is part of Sarasvati.

    Sarasvati is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    Sarasvati is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public
    License along with Sarasvati.  If not, see <http://www.gnu.org/licenses/>.

    Copyright 2008 Paul Lorenz
*/

package org.codemonk.wf.xml;

import java.io.File;

import javax.xml.bind.JAXBException;

public class DefaultFileXmlWorkflowResolver implements XmlWorkflowResolver
{
  protected File basePath;
  protected XmlLoader loader;

  public DefaultFileXmlWorkflowResolver (XmlLoader loader, File basePath)
  {
    this.basePath = basePath;
    this.loader = loader;
  }

  @Override
  public XmlWorkflow resolve (String name) throws JAXBException
  {
    File defFile = new File( basePath, name + ".wf.xml" );
    return loader.loadWorkflow( defFile );
  }
}