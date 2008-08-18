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
import com.googlecode.sarasvati.GuardResponse;
import com.googlecode.sarasvati.NodeToken;
import com.googlecode.sarasvati.Process;

public abstract class ExecutionEvent
{
  private ExecutionEventType eventType;

  public ExecutionEvent (ExecutionEventType eventType)
  {
    this.eventType = eventType;
  }

  /**
   * Returns what type of event has occurred.
   *
   * @return The type of event
   */
  public ExecutionEventType getEventType ()
  {
    return eventType;
  }

  /**
   * Returns the process the event has occurred on.
   *
   * @return The process the event has occurred on.
   */
  public abstract Process getProcess ();

  /**
   * If this is a node token related event, this returns the related node token and null otherwise.
   *
   * @return If this is a node token related event, this returns the related node token and null otherwise.
   */
  public NodeToken getNodeToken ()
  {
    return null;
  }

  /**
   * If this is an arc token related event, this returns the related arc token and null otherwise.
   *
   * @return If this is an arc token related event, this returns the related arc token and null otherwise.
   */
  public ArcToken getArcToken ()
  {
    return null;
  }

  /**
   * If this is a node token guard related event, this returns the {@link GuardResponse} returned by the
   * guard and null otherwise.
   *
   * @return The {@link GuardResponse}, if this event is related to a guard processing a NodeToken, null otherwise.
   */
  public GuardResponse getGuardResponse ()
  {
    return null;
  }
}