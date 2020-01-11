/*********************************************************************
 * Copyright 2005-2020 by Sebastian Thomschke and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *********************************************************************/
package net.sf.oval.exception;

/**
 * @author Sebastian Thomschke
 */
public class FieldNotFoundException extends ReflectionException {
   private static final long serialVersionUID = 1L;

   public FieldNotFoundException(final String message) {
      super(message);
   }

   public FieldNotFoundException(final String message, final Throwable cause) {
      super(message, cause);
   }

   public FieldNotFoundException(final Throwable cause) {
      super(cause);
   }
}
