<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <meta name="viewport" content="width=device-width, initialscale=1.0" />
    <title></title>    
    <!-- Bootstrap -->
    <link href="Content/bootstrap.min.css" rel="stylesheet" />    <link href="Content/StyleSheet.css" rel="stylesheet" />
    <link href="Content/StyleChart.css" rel="stylesheet" />

</head>
<body>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://code.jquery.com/jquery.js"></script>
    <!-- Include all compiled plugins (below), or include individual
    files as needed -->
    <script src="Scripts/bootstrap.min.js"></script>    <script src="Scripts/canvasjs.min.js"></script>
    <script src="Scripts/ChartCreation.js"></script>    <div class="container">        <div class="row">            <form id="form1" runat="server">                <asp:ScriptManager ID="ScriptManager1" runat="server"></asp:ScriptManager>
                <asp:UpdatePanel ID="UpdatePanel1" runat="server">                    <ContentTemplate>
                        <div class="panel panel-primary">
                            <div class="panel-heading">Tax Calculator</div>
                            <div class="panel-body bg-success">
                        <div class="col-sm-6">
                             <div class="panel panel-primary">
                                 <div class="panel-body">
                                     <div class="form-group">
                                         <div class="panel panel-danger">
                                             <div class="panel-heading">
                                         <asp:Label for="TxtIncomeInput" ID="LblIncome" runat="server">Enter Gross Salary(in pounds):</asp:Label>
                                                 </div>
                                             <div class="panel-body bg-success">
                                         <div class="input-group">
                                             <div class="input-group-addon">£</div>
                                             <asp:TextBox CssClass="form-control" ID="TxtIncomeInput" runat="server" placeholder="Gross Salary"></asp:TextBox>
                                             <div class="input-group-addon">.00</div>
                                         </div>
                                             </div>
                                         </div>
                                     </div>
                                     <div class="form-group">
                                         <div class="panel panel-danger">
                                             <div class="panel-heading">Tax Breakdown</div>
                                             <div class="panel-body bg-success">
                                         <asp:RadioButtonList ID="RadioButtonList1" runat="server" RepeatDirection="Vertical">
                                             <asp:ListItem>Yearly</asp:ListItem>
                                             <asp:ListItem>Monthly</asp:ListItem>
                                             <asp:ListItem>Weekly</asp:ListItem>
                                             <asp:ListItem>Daily</asp:ListItem>
                                         </asp:RadioButtonList>
                                             </div>
                                         </div>
                                         <asp:Button CssClass="btn btn-danger" ID="BtnCalculateTax" runat="server" Text="Calculate Tax" OnClick="BtnCalculateTax_Click" />
                                     </div>
                                      <%--<div id="chartContainerBreakdown" style="height: 300px; width: 100%;">
                        <div id="chartPlaceholderBreakdown"></div>
                        <div id="chartContainer"></div>
                        <div id="noDataPlaceholderBreakdown" class="h1"></div>
                    </div>--%>
                                 </div>
                             </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="panel panel-primary">
                                <div class="panel-heading">Full Income Breakdown</div>
                                 <div class="panel-body">
                                     <div class="form-group">
                                         <div class="panel panel-success">
                                             <div class="panel-heading">
                                                 <%--<p class="alert alert-info">--%><asp:Label ID="LabelPa" runat="server" Text="Personal Allowance:"></asp:Label><%--</p>--%>
                                             </div>
                                             <div class="panel-body bg-warning">
                                                 <%--<p class="alert alert-success">--%><asp:Label ID="LblPersonalAllow" runat="server" Text=""></asp:Label><%--</p>--%>
                                             </div>
                                         </div>
                                     </div>
                                     <div class="form-group">
                                         <div class="panel panel-success">
                                             <div class="panel-heading">
                                                 <%--<p class="alert alert-info">--%><asp:Label ID="Label45" runat="server" Text="Taxed at 45%:"></asp:Label><%--</p>--%>
                                             </div>
                                             <div class="panel-body bg-danger">
                                                 <%--<p class="alert alert-danger">--%><asp:Label ID="LblTax45" runat="server" Text=""></asp:Label><%--</p>--%>
                                             </div>
                                         </div>
                                     </div>
                                     <div class="form-group">
                                         <div class="panel panel-success">
                                             <div class="panel-heading">
                                                 <%--<p class="alert alert-info">--%><asp:Label ID="Label40" runat="server" Text="Taxed at 40%:"></asp:Label><%--</p>--%>
                                             </div>
                                             <div class="panel-body bg-danger">
                                                 <%--<p class="alert alert-danger">--%><asp:Label ID="LblTax40" runat="server" Text=""></asp:Label><%--</p>--%>
                                             </div>
                                         </div>
                                     </div>
                                     <div class="form-group">
                                         <div class="panel panel-success">
                                             <div class="panel-heading">
                                                 <%-- <p class="alert alert-info">--%><asp:Label ID="Label20" runat="server" Text="Taxed at 20%:"></asp:Label><%--</p>--%>
                                             </div>
                                             <div class="panel-body bg-danger">
                                                 <%--<p class="alert alert-danger">--%><asp:Label ID="LblTax20" runat="server" Text=""></asp:Label><%--</p>--%>
                                             </div>
                                         </div>               
                                     </div>
                                     <div class="form-group">
                                         <div class="panel panel-success">
                                             <div class="panel-heading">
                                                 <%--<p class="alert alert-info">--%><asp:Label ID="LabelNi" runat="server" Text="NIC Tax::"></asp:Label><%--</p>--%>
                                             </div>
                                             <div class="panel-body bg-danger">
                                                 <%--<p class="alert alert-warning">--%><asp:Label ID="LblTaxNi" runat="server" Text=""></asp:Label><%--</p>--%>
                                             </div>
                                         </div>
                                     </div>
                                     <div class="form-group">
                                         <div class="panel panel-success">
                                             <div class="panel-heading">
                                                 <%--<p class="alert alert-info">--%><asp:Label ID="LabelTotalTax" runat="server" Text="Total Tax Paid:"></asp:Label><%--</p>--%>
                                             </div>
                                             <div class="panel-body bg-danger">
                                                 <%--<p class="alert alert-danger">--%><asp:Label ID="LblTotalTax" runat="server" Text=""></asp:Label><%--</p>--%>
                                             </div>
                                         </div>
                                     </div>
                                     <div class="form-group">
                                         <div class="panel panel-success">
                                             <div class="panel-heading">
                                                 <%--<p class="alert alert-info">--%><asp:Label ID="LabelNetIncome" runat="server" Text="Net Income:"></asp:Label><%--</p>--%>
                                             </div>
                                             <div class="panel-body bg-warning">
                                                 <%--<p class="alert alert-success">--%><asp:Label ID="LblNetIncome" runat="server" Text=""></asp:Label><%--</p>--%>
                                             </div>
                                         </div>
                                     </div>
                                 </div>
                            </div>
                        </div>
                            </div>
                        </div>
                    </ContentTemplate>
                </asp:UpdatePanel>
            </form>
        </div>
    </div>
</body>
</html>
