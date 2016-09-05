<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <asp:ScriptManager ID="ScriptManager1" runat="server"></asp:ScriptManager>
    <div>
        <asp:UpdatePanel ID="UpdatePanel1" runat="server">
            <ContentTemplate>
                <asp:Label ID="LblIncome" runat="server" Text="Label"></asp:Label>
                <br />
                <br />
                <asp:TextBox ID="TxtIncomeInput" runat="server"></asp:TextBox>
                <br />
                <br />
                <asp:CheckBox ID="CheckBoxNi" runat="server" Text="Ni?" />
                <br />
                <br />
                <asp:Button ID="BtnCalculateTax" runat="server" Text="Calculate Tax" OnClick="BtnCalculateTax_Click" />
                <br />
                <br />
                <asp:Label ID="LabelPa" runat="server" Text="Personal Allowance:"></asp:Label>
                <br />
                <br />
                <asp:Label ID="LblPersonalAllow" runat="server" Text="Label"></asp:Label>
                <br />
                <br />
                <asp:Label ID="Label20" runat="server" Text="Taxed at 20%:"></asp:Label>
                <br />
                <br />
                <asp:Label ID="LblTax20" runat="server" Text="Label"></asp:Label>
                <br />
                <br />
                <asp:Label ID="Label40" runat="server" Text="Taxed at 40%:"></asp:Label>
                <br />
                <br />
                <asp:Label ID="LblTax40" runat="server" Text="Label"></asp:Label>
                <br />
                <br />
                <asp:Label ID="Label45" runat="server" Text="Taxed at 45%:"></asp:Label>
                <br />
                <br />
                <asp:Label ID="LblTax45" runat="server" Text="Label"></asp:Label>
                <br />
                <br />
                <asp:Label ID="LabelNi" runat="server" Text="NIC Tax::"></asp:Label>
                <br />
                <br />
                <asp:Label ID="LblTaxNi" runat="server" Text="Label"></asp:Label>
                <br />
                <br />
                <asp:Label ID="LabelTotalTax" runat="server" Text="Total Tax Paid:"></asp:Label>
                <br />
                <br />
                <asp:Label ID="LblTotalTax" runat="server" Text="Label"></asp:Label>
                <br />
                <br />
                <asp:Label ID="LabelNetIncome" runat="server" Text="Net Income:"></asp:Label>
                <br />
                <br />
                <asp:Label ID="LblNetIncome" runat="server" Text="Label"></asp:Label>
            </ContentTemplate>
        </asp:UpdatePanel>
    </div>
    </form>
</body>
</html>
