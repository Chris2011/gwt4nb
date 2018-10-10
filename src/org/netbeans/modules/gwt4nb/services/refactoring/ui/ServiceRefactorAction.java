/*
 * The contents of this file are subject to the terms of the Common Development
 * and Distribution License (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at http://www.netbeans.org/cddl.html
 * or http://www.netbeans.org/cddl.txt.
 *
 * When distributing Covered Code, include this CDDL Header Notice in each file
 * and include the License file at http://www.netbeans.org/cddl.txt.
 * If applicable, add the following below the CDDL Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * The Original Software is NetBeans. The Initial Developer of the Original
 * Software is Sun Microsystems, Inc. Portions Copyright 1997-2007 Sun
 * Microsystems, Inc. All Rights Reserved.
 */
package org.netbeans.modules.gwt4nb.services.refactoring.ui;

import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;

import org.openide.util.actions.SystemAction;
import org.openide.util.actions.Presenter.Menu;
import org.openide.util.actions.Presenter.Popup;

/** Action that displays refactoring submenu action delegates to it.
 *
 * @author Prem
 */
@ActionID(id = "org.netbeans.modules.gwt4nb.services.refactoring.ui.ServiceRefactorAction", category = "Tools")
@ActionRegistration(displayName = "LBL_ServiceRefactorAction", lazy = false)
@ActionReferences(value = {
    @ActionReference(path = "Editors/text/x-java/Popup"),
    @ActionReference(path = "Loaders/text/x-java/Actions")}
)
public class ServiceRefactorAction extends SystemAction implements Menu, Popup {
    private static final long serialVersionUID = 1;

    private final SubMenuAction action = new SubMenuAction(false);

    @Override
    public void actionPerformed(ActionEvent ev) {
        // do nothing -- should never be called
    }

    @Override
    public String getName() {
        return NbBundle.getMessage(ServiceRefactorAction.class,
                "SvcRef"); // NOI18N
    }

    @Override
    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;

    }

    @Override
    public JMenuItem getMenuPresenter() {
        return action.getMenuPresenter();
    }

    @Override
    public JMenuItem getPopupPresenter() {
        return action.getPopupPresenter();
    }
}