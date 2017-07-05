/*
 * Copyright (c) 2014, 2015, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

import javax.swing.*;

/**
 * AWT/Swing overlapping test for {@link javax.swing.JTable } component.
 * <p>See base class for details.
 */
/*
@test
@summary Simple Overlapping test for JTable
@author sergey.grinev@oracle.com: area=awt.mixing
@library ../../regtesthelpers
@modules java.desktop/sun.awt
         java.desktop/java.awt.peer
@build Util
@run main JTableOverlapping
 */
public class JTableOverlapping extends SimpleOverlappingTestBase {

    @Override
    protected JComponent getSwingComponent() {
        // Create columns names
        String columnNames[] = { "Column 1", "Column 2", "Column 3" };

        // Create some data
        String dataValues[][] =
        {
            { "12", "234", "67" },
            { "-123", "43", "853" },
            { "93", "89.2", "109" },
            { "279", "9033", "3092" },
            { "12", "234", "67" },
            { "-123", "43", "853" },
            { "93", "89.2", "109" },
            { "279", "9033", "3092" },
            { "12", "234", "67" },
            { "-123", "43", "853" },
            { "93", "89.2", "109" },
            { "279", "9033", "3092" },
            { "12", "234", "67" },
            { "-123", "43", "853" },
            { "93", "89.2", "109" },
            { "279", "9033", "3092" }
        };

        // Create a new table instance
        return new JTable( dataValues, columnNames );
    }

    // this strange plumbing stuff is required due to "Standard Test Machinery" in base class
    public static void main(String args[]) throws InterruptedException {
        instance = new JTableOverlapping();
        OverlappingTestBase.doMain(args);
    }
}
