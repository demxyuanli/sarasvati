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
package com.googlecode.sarasvati.event;

import com.googlecode.sarasvati.ArcToken;
import com.googlecode.sarasvati.Process;

public class ArcTokenEvent extends ExecutionEvent
{
  public static final ArcTokenEvent newCreatedEvent (ArcToken arcToken)
  {
    return new ArcTokenEvent( ExecutionEventType.ARC_TOKEN_CREATED, arcToken );
  }

  public static final ArcTokenEvent newCompletedEvent (ArcToken arcToken)
  {
    return new ArcTokenEvent( ExecutionEventType.ARC_TOKEN_COMPLETED, arcToken );
  }

  protected ArcToken arcToken;

  private ArcTokenEvent (ExecutionEventType eventType, ArcToken arcToken)
  {
    super( eventType );
    this.arcToken  = arcToken;
  }

  @Override
  public ArcToken getArcToken()
  {
    return arcToken;
  }

  @Override
  public Process getProcess()
  {
    return arcToken.getProcess();
  }
}