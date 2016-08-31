<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <h1>My Very First ASP.NET Web Forms Page</h1>
        <asp:Label ID="LabelName" runat="server" Text="Please Type Your Name: "></asp:Label>
        <asp:TextBox ID="TextBoxName" runat="server"></asp:TextBox>
        <asp:Button ID="ButtonName" runat="server" Text="Click Me!" OnClick="ButtonName_Click" />
        <br />
        <br />
        <asp:Label ID="LabelOutput" runat="server" Text=""></asp:Label>
        <br />
        <br />
    </div>
        <div>
            <asp:Label ID="LabelCheckBox" runat="server" Text="Please Check Or Uncheck Box: "></asp:Label>
            <br />
            <br />
            <asp:CheckBox ID="CheckBox1" runat="server" />
            <br />
            <br />
            <asp:Button ID="ButtonCheckBox" runat="server" Text="CheckBox Button" OnClick="ButtonCheckBox_Click" />
            <br />
            <br />
            <asp:Label ID="LabelCbOutput" runat="server" Text=""></asp:Label>
            <br />
            <br />
        </div>
            <div>
                <asp:Label ID="LabelRadio" runat="server" Text="Please Click The Radio Button:"></asp:Label>
                <br />
                <br />
                <asp:RadioButton ID="RadioButton1" runat="server" />
                <br />
                <br />
                <asp:Button ID="ButtonRadioButton" runat="server" Text="RadioButton Button" OnClick="ButtonRadioButton_Click" />
                <br />
                <br />
                <asp:Label ID="LabelRbOutput" runat="server" Text=""></asp:Label>
                <br />
                <br />
            </div>
        <div>
            <asp:Label ID="LabelRadioList" runat="server" Text="Please Click On A Radio Button In The List:"></asp:Label>
            <br />
            <br />
            <asp:RadioButtonList ID="RadioButtonList1" runat="server">
                <asp:ListItem>Radio Button 1</asp:ListItem>
                <asp:ListItem>Radio Button 2</asp:ListItem>
                <asp:ListItem>Radio Button 3</asp:ListItem>
            </asp:RadioButtonList>
            <br />
            <asp:Button ID="ButtonRadioList" runat="server" Text="Button" OnClick="ButtonRadioList_Click" />
            <br />
            <br />
            <asp:Label ID="LabelRbListOutput" runat="server" Text=""></asp:Label>
        </div>
    </form>
</body>
</html>
