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
    <h1>Crib Sheet</h1>
        <h3>Standard Controls</h3>
        <h4>Simple Controls</h4>
        <asp:Label ID="Label1" runat="server" Text="Here Is A Checkbox"></asp:Label>
        <br />
        <br />
        <asp:CheckBox ID="CheckBox1" runat="server" Text="Please Click This Checkbox And Click Confirm" />
        <br />
        <br />
        <asp:Button ID="ButtonChkBox" runat="server" Text="Confirm!" OnClick="ButtonChkBox_Click" />
        <br />
        <br />
        <asp:Label ID="LabelChkBoxOutput" runat="server" Text="Label"></asp:Label>
        <br />
        <br />
    </div>
        <div>
            <h4>Links</h4>
            <asp:LinkButton ID="LinkButton1" runat="server" href="http:\\www.google.com">LinkButton Google</asp:LinkButton>
            <br />
            <br />
            <asp:HyperLink ID="HyperLink1" runat="server" href="http:\\www.google.com" Target="_blank">HyperLink Google</asp:HyperLink>
            <br />
            <br />
            <asp:HyperLink ID="HyperLink2" runat="server" href="https://www.bmw.co.uk/en_GB/topics/discover-bmw/concept-cars.html" ImageUrl="https://www.bmw.co.uk/dam/brandBM/marketGB/countryGB/discoverbmw/concept-cars/pininfarina-gran-lusso-coupe/gran-lusso-slide-2.jpg.resource.1373957828340.jpg" imageWidth="200px">HyperLink</asp:HyperLink>
            <br />
            <br />
        </div>
        <div>
            <asp:Label ID="Label2" runat="server" Text="Here Is A Radio Button"></asp:Label>
            <br />
            <br />
            <asp:RadioButton ID="RadioButton1" runat="server" Text="Check This Radio Button And Click Confirm!" />
            <br />
            <br />
            <asp:Button ID="ButtonRb" runat="server" Text="Confirm!" OnClick="ButtonRb_Click" />
            <br />
            <br />
            <asp:Label ID="LabelRbOutput" runat="server" Text="Label"></asp:Label>
            <br />
            <br />
        </div>
        <div>
            <asp:Label ID="Label3" runat="server" Text="This is a multiline textbox"></asp:Label>
            <br />
            <br />
            <asp:TextBox ID="TextBoxMulti" runat="server" TextMode="MultiLine"></asp:TextBox>
            <br />
            <br />
            <asp:Button ID="ButtonTextBox" runat="server" Text="Text Box Button" OnClick="ButtonTextBox_Click" />
            <br />
            <br />
            <asp:Label ID="LabelTbOutput" runat="server" Text="Label"></asp:Label>
            <br />
            <br />
        </div>
        <div>
            <asp:Label ID="Label4" runat="server" Text="This is a textbox that accepts Email addresses:"></asp:Label>
            <br />
            <br />
            <asp:TextBox ID="TextBoxEmail" runat="server" TextMode="Email" ValidationExpression="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*"></asp:TextBox>
            <br />
            <br />
            <asp:Button ID="ButtonEmail" runat="server" Text="Check Email" OnClick="ButtonEmail_Click"/>
            <br />
            <br />
            <asp:Label ID="LabelEmailOutput" runat="server" Text="Label"></asp:Label>
            <br />
            <br />
        </div>
        <div>
            <asp:Calendar ID="Calendar1" runat="server" OnSelectionChanged="Calendar1_SelectionChanged"></asp:Calendar>
            <br />
            <br />
            <asp:Label ID="LabelDate" runat="server" Text="Label"></asp:Label>
            <br />
            <br />
        </div>
        <div>
            <h3>List Controls</h3>
            <asp:Label ID="Label5" runat="server" Text="What Is Your Favourite Programming Language?"></asp:Label>
            <br />
            <br />
            <asp:DropDownList ID="DropDownList1" runat="server">
                <asp:ListItem>C#</asp:ListItem>
                <asp:ListItem>JavaScript</asp:ListItem>
                <asp:ListItem>Java</asp:ListItem>
            </asp:DropDownList>
            <br />
            <br />
            <asp:Button ID="ButtonDropDown" runat="server" Text="Confirm Language" OnClick="ButtonDropDown_Click" />
            <br />
            <br />
            <asp:Label ID="LabelDdOutput" runat="server" Text="Label"></asp:Label>
            <br />
            <br />
        </div>
        <div>
            <asp:UpdatePanel ID="UpdatePanel1" runat="server">
                <ContentTemplate>
                        <asp:Label ID="Label6" runat="server" Text="Choose all the ice cream you like(you can pick more than 1)"></asp:Label>
                        <br />
                        <br />
                        <asp:CheckBoxList ID="CheckBoxList1" runat="server">
                        <asp:ListItem>Chocolate</asp:ListItem>
                        <asp:ListItem>Vanilla</asp:ListItem>
                        <asp:ListItem>Strawberry</asp:ListItem>
                        <asp:ListItem>Banana</asp:ListItem>
                        </asp:CheckBoxList>
                        <br />
                        <br />
                        <asp:Button ID="ButtonChkBoxList" runat="server" Text="Button" OnClick="ButtonChkBoxList_Click" />
                        <br />
                        <br />
                        <asp:Label ID="LabelChkBox1Output" runat="server" Text="Label"></asp:Label>
                        <br />
                        <br />
                </ContentTemplate>
            </asp:UpdatePanel>
        </div>
        <div>
            <asp:UpdatePanel ID="UpdatePanel2" runat="server">
                <ContentTemplate>
                        <asp:Label ID="Label7" runat="server" Text="Which Kind Of Music Do You Like?"></asp:Label>
                        <br />
                        <br />
                        <asp:RadioButtonList ID="RadioButtonList1" runat="server">
                        <asp:ListItem>Hip Hop</asp:ListItem>
                        <asp:ListItem>RnB</asp:ListItem>
                        <asp:ListItem>Grime</asp:ListItem>
                        <asp:ListItem>Garage</asp:ListItem>
                        </asp:RadioButtonList>
                        <br />
                        <br />
                        <asp:Button ID="ButtonRb1" runat="server" Text="Button" OnClick="ButtonRb1_Click" />
                        <br />
                        <br />
                        <asp:Label ID="LabelRbOutput1" runat="server" Text="Label"></asp:Label>
                </ContentTemplate>
            </asp:UpdatePanel>
        </div>
    </form>
</body>
</html>
