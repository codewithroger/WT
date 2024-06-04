<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">

        <html>
            <style>
                table,th,td{
                    border:1px solid;
                }
                table{
                    border-collapse:collapse;
                }

                table th{
                    padding:12px 10px;
                    text-align:left;
                }
                table td{
                    padding:8px 10px;
                }

            </style>
            <body>
                <h1>Employee Data XSM-XSLT</h1>
                    <table>
                        <tr>
                            <th>Emp ID</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Position</th>
                            <th>Salary</th>
                            <th>Department</th>
                            <th>Email</th>
                        </tr>

                        <xsl:for-each select="employees/employee">
                            <tr>
                                <td><xsl:value-of select="id"/></td>
                                <td><xsl:value-of select="firstName"/></td>
                                <td><xsl:value-of select="lastName"/></td>
                                <td><xsl:value-of select="position"/></td>
                                <td><xsl:value-of select="salary"/></td>
                                <td><xsl:value-of select="department"/></td>
                                <td><xsl:value-of select="email"/></td>

                            </tr>
                        </xsl:for-each>
                    </table>

            </body>
        </html>

    </xsl:template>
</xsl:stylesheet>