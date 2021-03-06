/*********************************************************************
 * Copyright 2005-2020 by Sebastian Thomschke and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *********************************************************************/
package net.sf.oval.localization.context;

import net.sf.oval.context.OValContext;

/**
 * @author Sebastian Thomschke
 */
public class ToStringValidationContextRenderer implements OValContextRenderer {
   public static final ToStringValidationContextRenderer INSTANCE = new ToStringValidationContextRenderer();

   @Override
   public String render(final OValContext ovalContext) {
      return ovalContext.toString();
   }
}
