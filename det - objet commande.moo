<?xml version="1.0" encoding="UTF-8"?>
<?PowerDesigner AppLocale="UTF16" ID="{9BD9F1BB-4107-4833-9624-4358CE282BE0}" Label="" LastModificationDate="1572451544" Name="det - objet commande" Objects="44" Symbols="36" Target="Java" TargetLink="Reference" Type="{18112060-1A4B-11D1-83D9-444553540000}" signature="CLD_OBJECT_MODEL" version="15.1.0.2850"?>
<!-- Veuillez ne pas modifier ce fichier -->

<Model xmlns:a="attribute" xmlns:c="collection" xmlns:o="object">

<o:RootObject Id="o1">
<c:Children>
<o:Model Id="o2">
<a:ObjectID>9BD9F1BB-4107-4833-9624-4358CE282BE0</a:ObjectID>
<a:Name>det - objet commande</a:Name>
<a:Code>det___objet_commande</a:Code>
<a:CreationDate>1572450200</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451541</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<a:PackageOptionsText>[FolderOptions]

[FolderOptions\Class Diagram Objects]
GenerationCheckModel=Yes
GenerationPath=
GenerationOptions=
GenerationTasks=
GenerationTargets=
GenerationSelections=</a:PackageOptionsText>
<a:ModelOptionsText>[ModelOptions]

[ModelOptions\Cld]
CaseSensitive=Yes
DisplayName=Yes
EnableTrans=Yes
EnableRequirements=No
ShowClss=No
DeftAttr=int
DeftMthd=int
DeftParm=int
DeftCont=java.util.Collection
DomnDttp=Yes
DomnChck=No
DomnRule=No
SupportDelay=No
PreviewEditable=Yes
AutoRealize=No
DttpFullName=Yes
DeftClssAttrVisi=private
VBNetPreprocessingSymbols=
CSharpPreprocessingSymbols=

[ModelOptions\Cld\NamingOptionsTemplates]

[ModelOptions\Cld\ClssNamingOptions]

[ModelOptions\Cld\ClssNamingOptions\CLDPCKG]

[ModelOptions\Cld\ClssNamingOptions\CLDPCKG\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,firstLowerWord)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDPCKG\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDDOMN]

[ModelOptions\Cld\ClssNamingOptions\CLDDOMN\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDDOMN\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDCLASS]

[ModelOptions\Cld\ClssNamingOptions\CLDCLASS\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,FirstUpperChar)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDCLASS\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDINTF]

[ModelOptions\Cld\ClssNamingOptions\CLDINTF\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,FirstUpperChar)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDINTF\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDACTR]

[ModelOptions\Cld\ClssNamingOptions\UCDACTR\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDACTR\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDUCAS]

[ModelOptions\Cld\ClssNamingOptions\UCDUCAS\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDUCAS\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDOBJT]

[ModelOptions\Cld\ClssNamingOptions\SQDOBJT\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDOBJT\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDMSSG]

[ModelOptions\Cld\ClssNamingOptions\SQDMSSG\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDMSSG\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CPDCOMP]

[ModelOptions\Cld\ClssNamingOptions\CPDCOMP\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,FirstUpperChar)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CPDCOMP\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDATTR]

[ModelOptions\Cld\ClssNamingOptions\CLDATTR\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,firstLowerWord)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDATTR\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDMETHOD]

[ModelOptions\Cld\ClssNamingOptions\CLDMETHOD\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,firstLowerWord)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDMETHOD\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDPARM]

[ModelOptions\Cld\ClssNamingOptions\CLDPARM\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,firstLowerWord)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDPARM\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPORT]

[ModelOptions\Cld\ClssNamingOptions\OOMPORT\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPORT\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPART]

[ModelOptions\Cld\ClssNamingOptions\OOMPART\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPART\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDASSC]

[ModelOptions\Cld\ClssNamingOptions\CLDASSC\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,firstLowerWord)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDASSC\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDASSC]

[ModelOptions\Cld\ClssNamingOptions\UCDASSC\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDASSC\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\GNRLLINK]

[ModelOptions\Cld\ClssNamingOptions\GNRLLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\GNRLLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RQLINK]

[ModelOptions\Cld\ClssNamingOptions\RQLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RQLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RLZSLINK]

[ModelOptions\Cld\ClssNamingOptions\RLZSLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RLZSLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DEPDLINK]

[ModelOptions\Cld\ClssNamingOptions\DEPDLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DEPDLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMACTV]

[ModelOptions\Cld\ClssNamingOptions\OOMACTV\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMACTV\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\ACDOBST]

[ModelOptions\Cld\ClssNamingOptions\ACDOBST\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\ACDOBST\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\STAT]

[ModelOptions\Cld\ClssNamingOptions\STAT\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\STAT\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDNODE]

[ModelOptions\Cld\ClssNamingOptions\DPDNODE\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDNODE\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDCMPI]

[ModelOptions\Cld\ClssNamingOptions\DPDCMPI\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDCMPI\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDASSC]

[ModelOptions\Cld\ClssNamingOptions\DPDASSC\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDASSC\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMVAR]

[ModelOptions\Cld\ClssNamingOptions\OOMVAR\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMVAR\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FILO]

[ModelOptions\Cld\ClssNamingOptions\FILO\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=&quot;\/:*?&lt;&gt;|&quot;
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FILO\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_. &quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMEOBJ]

[ModelOptions\Cld\ClssNamingOptions\FRMEOBJ\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMEOBJ\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMELNK]

[ModelOptions\Cld\ClssNamingOptions\FRMELNK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMELNK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DefaultClass]

[ModelOptions\Cld\ClssNamingOptions\DefaultClass\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DefaultClass\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Generate]

[ModelOptions\Generate\Cdm]
CheckModel=Yes
SaveLinks=Yes
NameToCode=No
Notation=2

[ModelOptions\Generate\Pdm]
CheckModel=Yes
SaveLinks=Yes
ORMapping=No
NameToCode=No
BuildTrgr=No
TablePrefix=
RefrUpdRule=RESTRICT
RefrDelRule=RESTRICT
IndxPKName=%TABLE%_PK
IndxAKName=%TABLE%_AK
IndxFKName=%REFR%_FK
IndxThreshold=
ColnFKName=%.3:PARENT%_%COLUMN%
ColnFKNameUse=No

[ModelOptions\Generate\Xsm]
CheckModel=Yes
SaveLinks=Yes
ORMapping=No
NameToCode=No</a:ModelOptionsText>
<c:ObjectLanguage>
<o:Shortcut Id="o3">
<a:ObjectID>231E21C9-D25C-4EFA-9382-E78ED557F2CF</a:ObjectID>
<a:Name>Java</a:Name>
<a:Code>Java</a:Code>
<a:CreationDate>1572450200</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450200</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>0DEDDB90-46E2-45A0-886E-411709DA0DC9</a:TargetID>
<a:TargetClassID>1811206C-1A4B-11D1-83D9-444553540000</a:TargetClassID>
</o:Shortcut>
</c:ObjectLanguage>
<c:ExtendedModelDefinitions>
<o:Shortcut Id="o4">
<a:ObjectID>F0DED704-C3ED-4725-861F-6BAC3FCF60D0</a:ObjectID>
<a:Name>WSDL for Java</a:Name>
<a:Code>WSDLJava</a:Code>
<a:CreationDate>1572450200</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450200</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>C8F5F7B2-CF9D-4E98-8301-959BB6E86C8A</a:TargetID>
<a:TargetClassID>186C8AC3-D3DC-11D3-881C-00508B03C75C</a:TargetClassID>
</o:Shortcut>
</c:ExtendedModelDefinitions>
<c:DefaultDiagram>
<o:StatechartDiagram Ref="o5"/>
</c:DefaultDiagram>
<c:StatechartDiagrams>
<o:StatechartDiagram Id="o5">
<a:ObjectID>AB713A9C-350A-488C-B70E-C69F76CB9CBF</a:ObjectID>
<a:Name>etats transitions -objet Commande</a:Name>
<a:Code>etats_transitions__objet_Commande</a:Code>
<a:CreationDate>1572450200</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451529</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<a:DisplayPreferences>[DisplayPreferences]

[DisplayPreferences\STD]

[DisplayPreferences\General]
Adjust to text=Yes
Snap Grid=No
Constrain Labels=Yes
Display Grid=No
Show Page Delimiter=No
Grid size=800
Graphic unit=2
Window color=255 255 255
Background image=
Background mode=8
Watermark image=
Watermark mode=8
Show watermark on screen=No
Gradient mode=0
Gradient end color=255 255 255
Show Swimlane=No
SwimlaneVert=Yes
TreeVert=No
CompDark=0

[DisplayPreferences\Object]
Mode=2
Trunc Length=40
Word Length=40
Word Text=!&quot;&quot;#$%&amp;&#39;()*+,-./:;&lt;=&gt;?@[\]^_`{|}~
Shortcut IntIcon=Yes
Shortcut IntLoct=Yes
Shortcut IntFullPath=No
Shortcut IntLastPackage=Yes
Shortcut ExtIcon=Yes
Shortcut ExtLoct=No
Shortcut ExtFullPath=No
Shortcut ExtLastPackage=Yes
Shortcut ExtIncludeModl=Yes
EObjShowStrn=Yes
ExtendedObject.Comment=No
ExtendedObject.IconPicture=No
ExtendedObject_SymbolLayout=&lt;Form&gt;[CRLF] &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Nom de l&amp;#39;objet&quot; Attribute=&quot;DisplayName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF] &lt;Separator Name=&quot;Séparateur&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Commentaire&quot; Attribute=&quot;Comment&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;LEFT&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Icône&quot; Attribute=&quot;IconPicture&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF]&lt;/Form&gt;
ELnkShowStrn=Yes
ELnkShowName=Yes
ExtendedLink_SymbolLayout=&lt;Form&gt;[CRLF] &lt;Form Name=&quot;Centre&quot; &gt;[CRLF]  &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF]  &lt;StandardAttribute Name=&quot;Nom&quot; Attribute=&quot;DisplayName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;/Form&gt;[CRLF] &lt;Form Name=&quot;Source&quot; &gt;[CRLF] &lt;/Form&gt;[CRLF] &lt;Form Name=&quot;Destination&quot; &gt;[CRLF] &lt;/Form&gt;[CRLF]&lt;/Form&gt;
FileObject.Stereotype=No
FileObject.DisplayName=Yes
FileObject.LocationOrName=No
FileObject.IconPicture=No
FileObject.IconMode=Yes
FileObject_SymbolLayout=&lt;Form&gt;[CRLF] &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;ExclusiveChoice Name=&quot;Choix exclusif&quot; Mandatory=&quot;Yes&quot; Display=&quot;HorizontalRadios&quot; &gt;[CRLF]  &lt;StandardAttribute Name=&quot;Nom&quot; Attribute=&quot;DisplayName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF]  &lt;StandardAttribute Name=&quot;Emplacement&quot; Attribute=&quot;LocationOrName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;/ExclusiveChoice&gt;[CRLF] &lt;StandardAttribute Name=&quot;Icône&quot; Attribute=&quot;IconPicture&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF]&lt;/Form&gt;
PckgShowStrn=Yes
Package.Comment=No
Package.IconPicture=No
Package_SymbolLayout=
Display Model Version=Yes
State.Stereotype=Yes
State.Actions=Yes
State.Actions._Columns=LabelWithArguments
State.Actions._Limit=-3
State.Comment=No
State.IconPicture=No
State.SubSymbols=Yes
State_SymbolLayout=&lt;Form&gt;[CRLF] &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Nom&quot; Attribute=&quot;SmallDisplayName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF] &lt;Separator Name=&quot;Séparateur&quot; /&gt;[CRLF] &lt;StandardCollection Name=&quot;Actions&quot; Collection=&quot;Actions&quot; Columns=&quot;Label No &amp;quot;Evénement et nom&amp;quot;\r\nLabelWithArguments No &amp;quot;Evénement, nom et arguments&amp;quot;&quot; HasLimit=&quot;Yes&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Commentaire&quot; Attribute=&quot;Comment&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;LEFT&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Icône&quot; Attribute=&quot;IconPicture&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF]&lt;/Form&gt;
JunctionPoint.Stereotype=Yes
JunctionPoint.DisplayName=No
JunctionPoint.IconPicture=No
JunctionPoint_SymbolLayout=&lt;Form&gt;[CRLF] &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Nom&quot; Attribute=&quot;DisplayName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;Separator Name=&quot;Séparateur&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Icône&quot; Attribute=&quot;IconPicture&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF]&lt;/Form&gt;
Start.Stereotype=Yes
Start.DisplayName=No
Start.IconPicture=No
Start_SymbolLayout=&lt;Form&gt;[CRLF] &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Nom&quot; Attribute=&quot;DisplayName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;Separator Name=&quot;Séparateur&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Icône&quot; Attribute=&quot;IconPicture&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF]&lt;/Form&gt;
End.Stereotype=Yes
End.DisplayName=No
End.IconPicture=No
End_SymbolLayout=
Synchronization.IconPicture=No
Synchronization_SymbolLayout=
Transition.Label=Yes
Transition.LabelWithArguments=No
Transition.Stereotype=Yes
Transition_SymbolLayout=&lt;Form&gt;[CRLF] &lt;Form Name=&quot;Source&quot; &gt;[CRLF]  &lt;ExclusiveChoice Name=&quot;Choix exclusif&quot; Mandatory=&quot;Yes&quot; Display=&quot;VerticalRadios&quot; &gt;[CRLF]   &lt;StandardAttribute Name=&quot;Evénement et nom&quot; Attribute=&quot;Label&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF]   &lt;StandardAttribute Name=&quot;Evénement, nom et arguments&quot; Attribute=&quot;LabelWithArguments&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF]  &lt;/ExclusiveChoice&gt;[CRLF] &lt;/Form&gt;[CRLF] &lt;Form Name=&quot;Destination&quot; &gt;[CRLF]  &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;/Form&gt;[CRLF] &lt;Form Name=&quot;Centre&quot; &gt;[CRLF] &lt;/Form&gt;[CRLF]&lt;/Form&gt;

[DisplayPreferences\Symbol]

[DisplayPreferences\Symbol\FRMEOBJ]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
LABLFont=Arial,8,N
LABLFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=6000
Height=2000
Brush color=255 255 255
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=64
Brush gradient color=192 192 192
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 255 128 128
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\FRMELNK]
CENTERFont=Arial,8,N
CENTERFont color=0, 0, 0
Line style=1
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 128 255
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\FILO]
OBJSTRNFont=Arial,8,N
OBJSTRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
LCNMFont=Arial,8,N
LCNMFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=3600
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 0 255
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\CLDPCKG]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
LABLFont=Arial,8,N
LABLFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=3600
Brush color=255 255 192
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 178 178 178
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\STAT]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAME2Font=Arial,8,N
DISPNAME2Font color=0, 0, 0
ActionsFont=Arial,8,N
ActionsFont color=0, 0, 0
LABLFont=Arial,8,N
LABLFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=6000
Height=2500
Brush color=192 255 255
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 128 192
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\JNPT]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=Yes
Keep center=Yes
Keep size=Yes
Width=1400
Height=1400
Brush color=255 255 255
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=224 224 224
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 128 192
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\OOMSTRT]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=Yes
Keep center=Yes
Keep size=Yes
Width=1200
Height=1200
Brush color=0 128 192
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=192 192 192
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 128 192
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\OOMEND]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=Yes
Keep center=Yes
Keep size=Yes
Width=1500
Height=1500
Brush color=0 128 192
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=192 192 192
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 128 192
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\OOMSYNC]
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=2400
Height=1500
Brush color=0 128 192
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=512
Brush gradient color=0 128 192
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 128 192
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\ACDTRNS]
SOURCEFont=Arial,8,N
SOURCEFont color=0, 0, 0
DESTINATIONFont=Arial,8,N
DESTINATIONFont color=0, 0, 0
Line style=1
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 128 255
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\USRDEPD]
OBJXSTRFont=Arial,8,N
OBJXSTRFont color=0, 0, 0
Line style=1
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=2 0 128 128 255
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\Free Symbol]
Free TextFont=Arial,8,N
Free TextFont color=0, 0, 0
Line style=0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 0 255
Shadow color=192 192 192
Shadow=0</a:DisplayPreferences>
<a:PaperSize>(8268, 11693)</a:PaperSize>
<a:PageMargins>((315,354), (433,354))</a:PageMargins>
<a:PageOrientation>1</a:PageOrientation>
<a:PaperSource>15</a:PaperSource>
<c:Symbols>
<o:TransitionSymbol Id="o6">
<a:CreationDate>1572450380</a:CreationDate>
<a:ModificationDate>1572450868</a:ModificationDate>
<a:Rect>((-10267,1400), (-2987,13624))</a:Rect>
<a:ListOfPoints>((-10037,13624),(-10046,1400))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StartSymbol Ref="o7"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o9"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o10">
<a:CreationDate>1572450413</a:CreationDate>
<a:ModificationDate>1572451078</a:ModificationDate>
<a:Rect>((-9674,-8637), (-1275,2100))</a:Rect>
<a:ListOfPoints>((-9449,2100),(-9449,-8637))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o8"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o11"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o12"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o13">
<a:CreationDate>1572450440</a:CreationDate>
<a:ModificationDate>1572451145</a:ModificationDate>
<a:Rect>((-9112,-14750), (13788,-9725))</a:Rect>
<a:ListOfPoints>((-9112,-9725),(-9112,-14750),(13788,-14750))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o11"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o14"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o15"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o16">
<a:CreationDate>1572450489</a:CreationDate>
<a:ModificationDate>1572451187</a:ModificationDate>
<a:Rect>((-12512,-21387), (17388,-15787))</a:Rect>
<a:ListOfPoints>((11088,-15787),(11088,-21387),(-12512,-21387))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o14"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o17"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o18"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o19">
<a:CreationDate>1572450492</a:CreationDate>
<a:ModificationDate>1572451173</a:ModificationDate>
<a:Rect>((-10787,-25547), (6013,-21825))</a:Rect>
<a:ListOfPoints>((-10787,-21825),(-10787,-23950),(6013,-23950))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o17"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o20"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o21"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o22">
<a:CreationDate>1572450493</a:CreationDate>
<a:ModificationDate>1572451173</a:ModificationDate>
<a:Rect>((9688,-23512), (26938,-22112))</a:Rect>
<a:ListOfPoints>((9688,-23287),(26938,-23287))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o20"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o23"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o24"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o25">
<a:CreationDate>1572450806</a:CreationDate>
<a:ModificationDate>1572450868</a:ModificationDate>
<a:Rect>((-14961,1125), (-1912,5572))</a:Rect>
<a:ListOfPoints>((-7237,2625),(-7237,4425),(-1912,4425),(-1912,1125),(-8320,1125))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o8"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o26"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o27">
<a:CreationDate>1572450894</a:CreationDate>
<a:ModificationDate>1572450910</a:ModificationDate>
<a:Rect>((-7987,-2400), (7687,1725))</a:Rect>
<a:ListOfPoints>((-7987,1725),(-7987,800),(7687,-2400))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o8"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:EndSymbol Ref="o28"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o29"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o30">
<a:CreationDate>1572450993</a:CreationDate>
<a:ModificationDate>1572451078</a:ModificationDate>
<a:Rect>((-11887,-9050), (-2812,-5402))</a:Rect>
<a:ListOfPoints>((-6937,-8750),(-6937,-6125),(-2812,-6125),(-2812,-9050),(-7087,-9050))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o11"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o11"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o31"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o32">
<a:CreationDate>1572451054</a:CreationDate>
<a:ModificationDate>1572451107</a:ModificationDate>
<a:Rect>((-7612,-9600), (7687,-2400))</a:Rect>
<a:ListOfPoints>((-7612,-9350),(7588,-9600),(7687,-2400))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o11"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:EndSymbol Ref="o28"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o33"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o34">
<a:CreationDate>1572451133</a:CreationDate>
<a:ModificationDate>1572451156</a:ModificationDate>
<a:Rect>((7687,-15600), (15463,6226))</a:Rect>
<a:ListOfPoints>((15463,-15600),(15463,6226),(7687,6226),(7687,-2400))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o14"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:EndSymbol Ref="o28"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o35"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o36">
<a:CreationDate>1572451264</a:CreationDate>
<a:ModificationDate>1572451500</a:ModificationDate>
<a:Rect>((6538,-35700), (13137,-24225))</a:Rect>
<a:ListOfPoints>((6763,-24225),(6763,-35700))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o20"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o37"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o38"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o39">
<a:CreationDate>1572451375</a:CreationDate>
<a:ModificationDate>1572451514</a:ModificationDate>
<a:Rect>((2113,-35700), (5712,-23700))</a:Rect>
<a:ListOfPoints>((2338,-23700),(2338,-35700))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o20"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o37"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o40"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o41">
<a:CreationDate>1572451397</a:CreationDate>
<a:ModificationDate>1572451500</a:ModificationDate>
<a:Rect>((-9562,-35250), (663,-22125))</a:Rect>
<a:ListOfPoints>((-9562,-22125),(-9562,-35250),(663,-35250))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o17"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o37"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o42"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o43">
<a:CreationDate>1572451529</a:CreationDate>
<a:ModificationDate>1572451529</a:ModificationDate>
<a:Rect>((23001,-22875), (26411,-13125))</a:Rect>
<a:ListOfPoints>((26287,-22875),(26062,-13125))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o23"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:EndSymbol Ref="o44"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o45"/>
</c:Object>
</o:TransitionSymbol>
<o:TextSymbol Id="o46">
<a:Text>états et transitions de la vie normale d&#39;une commande</a:Text>
<a:CreationDate>1572450259</a:CreationDate>
<a:ModificationDate>1572450736</a:ModificationDate>
<a:Rect>((-14761,14651), (11637,18250))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>0</a:LineColor>
<a:DashStyle>7</a:DashStyle>
<a:FillColor>0</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,8,N</a:FontName>
<a:ManuallyResized>1</a:ManuallyResized>
</o:TextSymbol>
<o:StartSymbol Id="o7">
<a:CreationDate>1572450329</a:CreationDate>
<a:ModificationDate>1572450730</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-10637,13025), (-9438,14224))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>12615680</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>12632256</a:GradientEndColor>
<a:KeepAspect>1</a:KeepAspect>
<a:KeepCenter>1</a:KeepCenter>
<a:KeepSize>1</a:KeepSize>
<c:Object>
<o:Start Ref="o47"/>
</c:Object>
</o:StartSymbol>
<o:StateSymbol Id="o8">
<a:CreationDate>1572450335</a:CreationDate>
<a:ModificationDate>1572450868</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-14257,651), (-6121,3198))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>16777152</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME2 0 Arial,8,N
Actions 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:State Ref="o48"/>
</c:Object>
</o:StateSymbol>
<o:StateSymbol Id="o11">
<a:CreationDate>1572450400</a:CreationDate>
<a:ModificationDate>1572451078</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-12375,-10324), (-6375,-7777))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>16777152</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME2 0 Arial,8,N
Actions 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:State Ref="o49"/>
</c:Object>
</o:StateSymbol>
<o:StateSymbol Id="o14">
<a:CreationDate>1572450426</a:CreationDate>
<a:ModificationDate>1572451145</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((11013,-16750), (17012,-14251))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>16777152</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME2 0 Arial,8,N
Actions 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:State Ref="o50"/>
</c:Object>
</o:StateSymbol>
<o:StateSymbol Id="o17">
<a:CreationDate>1572450447</a:CreationDate>
<a:ModificationDate>1572451121</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-13582,-23174), (-7396,-20627))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>16777152</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME2 0 Arial,8,N
Actions 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:State Ref="o51"/>
</c:Object>
</o:StateSymbol>
<o:StateSymbol Id="o20">
<a:CreationDate>1572450461</a:CreationDate>
<a:ModificationDate>1572451173</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((2244,-25149), (10456,-22602))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>16777152</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME2 0 Arial,8,N
Actions 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:State Ref="o52"/>
</c:Object>
</o:StateSymbol>
<o:StateSymbol Id="o23">
<a:CreationDate>1572450475</a:CreationDate>
<a:ModificationDate>1572451170</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((24576,-23899), (30576,-21352))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>16777152</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME2 0 Arial,8,N
Actions 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:State Ref="o53"/>
</c:Object>
</o:StateSymbol>
<o:EndSymbol Id="o28">
<a:CreationDate>1572450886</a:CreationDate>
<a:ModificationDate>1572450886</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((6938,-3150), (8437,-1651))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>12615680</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>12632256</a:GradientEndColor>
<a:KeepAspect>1</a:KeepAspect>
<a:KeepCenter>1</a:KeepCenter>
<a:KeepSize>1</a:KeepSize>
<c:Object>
<o:End Ref="o54"/>
</c:Object>
</o:EndSymbol>
<o:StateSymbol Id="o37">
<a:CreationDate>1572451221</a:CreationDate>
<a:ModificationDate>1572451500</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-143,-36674), (7618,-34127))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>16777152</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME2 0 Arial,8,N
Actions 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:State Ref="o55"/>
</c:Object>
</o:StateSymbol>
<o:EndSymbol Id="o44">
<a:CreationDate>1572451437</a:CreationDate>
<a:ModificationDate>1572451437</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((25313,-13875), (26812,-12376))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>12615680</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>12632256</a:GradientEndColor>
<a:KeepAspect>1</a:KeepAspect>
<a:KeepCenter>1</a:KeepCenter>
<a:KeepSize>1</a:KeepSize>
<c:Object>
<o:End Ref="o56"/>
</c:Object>
</o:EndSymbol>
</c:Symbols>
</o:StatechartDiagram>
</c:StatechartDiagrams>
<c:Transitions>
<o:Transition Id="o9">
<a:ObjectID>24A40A1F-EEEB-43E2-BE2C-F42A57E806F8</a:ObjectID>
<a:CreationDate>1572450380</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450540</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<c:Object1>
<o:State Ref="o48"/>
</c:Object1>
<c:Object2>
<o:Start Ref="o47"/>
</c:Object2>
<c:TriggerEvent>
<o:Event Ref="o57"/>
</c:TriggerEvent>
</o:Transition>
<o:Transition Id="o12">
<a:ObjectID>21CEF526-BBBF-42EF-A078-FCEB2B85249D</a:ObjectID>
<a:CreationDate>1572450413</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450966</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<a:ConditionAlias>complète</a:ConditionAlias>
<c:Object1>
<o:State Ref="o49"/>
</c:Object1>
<c:Object2>
<o:State Ref="o48"/>
</c:Object2>
<c:TriggerEvent>
<o:Event Ref="o58"/>
</c:TriggerEvent>
</o:Transition>
<o:Transition Id="o15">
<a:ObjectID>04BEC69E-26DA-422E-9AAF-4305866B7A2F</a:ObjectID>
<a:CreationDate>1572450440</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450619</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<c:Object1>
<o:State Ref="o50"/>
</c:Object1>
<c:Object2>
<o:State Ref="o49"/>
</c:Object2>
<c:TriggerEvent>
<o:Event Ref="o59"/>
</c:TriggerEvent>
</o:Transition>
<o:Transition Id="o18">
<a:ObjectID>4387C1B2-B0FA-4213-A32E-A67E58DE9740</a:ObjectID>
<a:CreationDate>1572450489</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450635</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<c:Object1>
<o:State Ref="o51"/>
</c:Object1>
<c:Object2>
<o:State Ref="o50"/>
</c:Object2>
<c:TriggerEvent>
<o:Event Ref="o60"/>
</c:TriggerEvent>
</o:Transition>
<o:Transition Id="o21">
<a:ObjectID>6B542BDA-3FEA-4DE0-8F09-658CBD3BA1B8</a:ObjectID>
<a:CreationDate>1572450492</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450656</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<c:Object1>
<o:State Ref="o52"/>
</c:Object1>
<c:Object2>
<o:State Ref="o51"/>
</c:Object2>
<c:TriggerEvent>
<o:Event Ref="o61"/>
</c:TriggerEvent>
</o:Transition>
<o:Transition Id="o24">
<a:ObjectID>5F9B178C-D834-44FD-B6C5-3BE91A044255</a:ObjectID>
<a:CreationDate>1572450493</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450678</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<c:Object1>
<o:State Ref="o53"/>
</c:Object1>
<c:Object2>
<o:State Ref="o52"/>
</c:Object2>
<c:TriggerEvent>
<o:Event Ref="o62"/>
</c:TriggerEvent>
</o:Transition>
<o:Transition Id="o26">
<a:ObjectID>2B534467-56E0-4D6A-B22E-F04718F7E2CF</a:ObjectID>
<a:CreationDate>1572450806</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450862</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<a:ConditionAlias>incomplète</a:ConditionAlias>
<c:Object1>
<o:State Ref="o48"/>
</c:Object1>
<c:Object2>
<o:State Ref="o48"/>
</c:Object2>
<c:TriggerEvent>
<o:Event Ref="o63"/>
</c:TriggerEvent>
</o:Transition>
<o:Transition Id="o29">
<a:ObjectID>C2C5F1F6-7787-4B0F-940D-38BE83638265</a:ObjectID>
<a:CreationDate>1572450894</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450894</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<c:Object1>
<o:End Ref="o54"/>
</c:Object1>
<c:Object2>
<o:State Ref="o48"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o31">
<a:ObjectID>6A445BAA-000A-4F46-871D-C1A09E0E6866</a:ObjectID>
<a:CreationDate>1572450993</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451028</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<a:ConditionAlias>refus</a:ConditionAlias>
<c:Object1>
<o:State Ref="o49"/>
</c:Object1>
<c:Object2>
<o:State Ref="o49"/>
</c:Object2>
<c:TriggerEvent>
<o:Event Ref="o64"/>
</c:TriggerEvent>
</o:Transition>
<o:Transition Id="o33">
<a:ObjectID>56A4049F-E4D9-4C6C-885E-AB0B4692098B</a:ObjectID>
<a:CreationDate>1572451054</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451063</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<c:Object1>
<o:End Ref="o54"/>
</c:Object1>
<c:Object2>
<o:State Ref="o49"/>
</c:Object2>
<c:TriggerEvent>
<o:Event Ref="o65"/>
</c:TriggerEvent>
</o:Transition>
<o:Transition Id="o35">
<a:ObjectID>EFAF7BBD-09BC-4DFE-A810-06711B3ED0BA</a:ObjectID>
<a:CreationDate>1572451133</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451133</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<c:Object1>
<o:End Ref="o54"/>
</c:Object1>
<c:Object2>
<o:State Ref="o50"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o38">
<a:ObjectID>4D2CD5D3-8EB8-4FA5-B15A-DF75AED22BA5</a:ObjectID>
<a:CreationDate>1572451264</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451271</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<c:Object1>
<o:State Ref="o55"/>
</c:Object1>
<c:Object2>
<o:State Ref="o52"/>
</c:Object2>
<c:TriggerEvent>
<o:Event Ref="o66"/>
</c:TriggerEvent>
</o:Transition>
<o:Transition Id="o40">
<a:ObjectID>AC04743E-1D75-4F10-8ADF-6A0156139FBB</a:ObjectID>
<a:CreationDate>1572451375</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451382</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<c:Object1>
<o:State Ref="o55"/>
</c:Object1>
<c:Object2>
<o:State Ref="o52"/>
</c:Object2>
<c:TriggerEvent>
<o:Event Ref="o67"/>
</c:TriggerEvent>
</o:Transition>
<o:Transition Id="o42">
<a:ObjectID>D24F873F-F206-44ED-BBD3-1113406A1568</a:ObjectID>
<a:CreationDate>1572451397</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451404</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<c:Object1>
<o:State Ref="o55"/>
</c:Object1>
<c:Object2>
<o:State Ref="o51"/>
</c:Object2>
<c:TriggerEvent>
<o:Event Ref="o68"/>
</c:TriggerEvent>
</o:Transition>
<o:Transition Id="o45">
<a:ObjectID>76D25537-8907-46EF-A63C-1074E14D28B5</a:ObjectID>
<a:CreationDate>1572451529</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451541</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<c:Object1>
<o:End Ref="o56"/>
</c:Object1>
<c:Object2>
<o:State Ref="o53"/>
</c:Object2>
<c:TriggerEvent>
<o:Event Ref="o69"/>
</c:TriggerEvent>
</o:Transition>
</c:Transitions>
<c:Starts>
<o:Start Id="o47">
<a:ObjectID>35FFCD5B-36C1-4350-A3D6-8F3EF9A15E0E</a:ObjectID>
<a:Name>Debut_1</a:Name>
<a:Code>Debut_1</a:Code>
<a:CreationDate>1572450329</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450540</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:Start>
</c:Starts>
<c:Ends>
<o:End Id="o54">
<a:ObjectID>51763B22-FC43-4118-9747-421DDE8045DC</a:ObjectID>
<a:Name>Fin_1</a:Name>
<a:Code>Fin_1</a:Code>
<a:CreationDate>1572450886</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451063</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<a:Stereotype>annulée</a:Stereotype>
</o:End>
<o:End Id="o56">
<a:ObjectID>0306A629-9A78-40EB-A3AE-4AF915556A4D</a:ObjectID>
<a:Name>Fin_2</a:Name>
<a:Code>Fin_2</a:Code>
<a:CreationDate>1572451437</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451541</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<a:Stereotype>archivée</a:Stereotype>
</o:End>
</c:Ends>
<c:States>
<o:State Id="o48">
<a:ObjectID>2F3569D9-387F-4716-A126-6D31B3100F33</a:ObjectID>
<a:Name>En cours de création</a:Name>
<a:Code>En_cours_de_creation</a:Code>
<a:CreationDate>1572450335</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450966</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:State>
<o:State Id="o49">
<a:ObjectID>FD626098-9F78-46D1-B0B1-42848719AE7B</a:ObjectID>
<a:Name>validée</a:Name>
<a:Code>validee</a:Code>
<a:CreationDate>1572450400</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451063</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:State>
<o:State Id="o50">
<a:ObjectID>ABC6772E-1505-4C39-B980-E7C3B0523D17</a:ObjectID>
<a:Name>payée</a:Name>
<a:Code>payee</a:Code>
<a:CreationDate>1572450426</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450635</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:State>
<o:State Id="o51">
<a:ObjectID>44454BF2-489F-427B-9029-054791045785</a:ObjectID>
<a:Name>En préparation</a:Name>
<a:Code>En_preparation</a:Code>
<a:CreationDate>1572450447</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451404</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:State>
<o:State Id="o52">
<a:ObjectID>B7372378-2CA6-4311-989F-C0621799424B</a:ObjectID>
<a:Name>En cours de livraison</a:Name>
<a:Code>En_cours_de_livraison</a:Code>
<a:CreationDate>1572450461</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451382</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:State>
<o:State Id="o53">
<a:ObjectID>09170D74-05C4-4872-A13B-FA8177CB9FC7</a:ObjectID>
<a:Name>livrée</a:Name>
<a:Code>livree</a:Code>
<a:CreationDate>1572450475</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451541</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:State>
<o:State Id="o55">
<a:ObjectID>D1BC09A3-F59D-4D29-BA64-CE1A2664C5C6</a:ObjectID>
<a:Name>incident de mission</a:Name>
<a:Code>incident_de_mission</a:Code>
<a:CreationDate>1572451221</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451404</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:State>
</c:States>
<c:Events>
<o:Event Id="o57">
<a:ObjectID>68AA12E8-E0A3-40D9-BA67-C1E043F5DC72</a:ObjectID>
<a:Name>passer commande</a:Name>
<a:Code>passer_commande</a:Code>
<a:CreationDate>1572450507</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450555</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:Event>
<o:Event Id="o58">
<a:ObjectID>84B63465-A772-472C-A624-771B99B7F1A3</a:ObjectID>
<a:Name>validation</a:Name>
<a:Code>validation</a:Code>
<a:CreationDate>1572450597</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450606</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:Event>
<o:Event Id="o59">
<a:ObjectID>1B463813-39CC-4EDF-8A83-37966DD71215</a:ObjectID>
<a:Name>paiement</a:Name>
<a:Code>paiement</a:Code>
<a:CreationDate>1572450615</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451019</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:Event>
<o:Event Id="o60">
<a:ObjectID>3408FBF0-F4C9-41BB-AF31-4D9C13B32D1A</a:ObjectID>
<a:Name>prise en compte</a:Name>
<a:Code>prise_en_compte</a:Code>
<a:CreationDate>1572450626</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450645</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:Event>
<o:Event Id="o61">
<a:ObjectID>A78212EF-3165-4F88-9BE8-F09BCC9D7D9F</a:ObjectID>
<a:Name>départ mission</a:Name>
<a:Code>depart_mission</a:Code>
<a:CreationDate>1572450649</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450666</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:Event>
<o:Event Id="o62">
<a:ObjectID>A32E8343-A9D8-4951-B34A-D11A33075179</a:ObjectID>
<a:Name>livraison</a:Name>
<a:Code>livraison</a:Code>
<a:CreationDate>1572450672</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450685</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:Event>
<o:Event Id="o63">
<a:ObjectID>C1838CE3-F83A-4AD6-9B13-324739F41777</a:ObjectID>
<a:Name>valider</a:Name>
<a:Code>valider</a:Code>
<a:CreationDate>1572450813</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450822</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:Event>
<o:Event Id="o64">
<a:ObjectID>F0F14157-1943-4927-ABFD-C33D4D8B2F47</a:ObjectID>
<a:Name>payer</a:Name>
<a:Code>payer</a:Code>
<a:CreationDate>1572451000</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451021</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:Event>
<o:Event Id="o65">
<a:ObjectID>EE146238-B4E9-4D8C-872C-F3EC4B83C6B3</a:ObjectID>
<a:Name>annuler</a:Name>
<a:Code>annuler</a:Code>
<a:CreationDate>1572451056</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451067</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:Event>
<o:Event Id="o66">
<a:ObjectID>4DFBBC2B-59C5-4037-AB19-87BF154679E6</a:ObjectID>
<a:Name>incident mission</a:Name>
<a:Code>incident_mission</a:Code>
<a:CreationDate>1572451267</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451277</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:Event>
<o:Event Id="o67">
<a:ObjectID>624CDC52-93DC-4169-AFDC-3D84C5D136D1</a:ObjectID>
<a:Name>non OK</a:Name>
<a:Code>non_OK</a:Code>
<a:CreationDate>1572451377</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451386</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:Event>
<o:Event Id="o68">
<a:ObjectID>6956B6A9-C87E-40DC-8E83-3CF5C92FE36F</a:ObjectID>
<a:Name>incident irréparable</a:Name>
<a:Code>incident_irreparable</a:Code>
<a:CreationDate>1572451399</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451414</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:Event>
<o:Event Id="o69">
<a:ObjectID>18BCD739-AA51-49F1-B3F3-E8408DD3EBCC</a:ObjectID>
<a:Name>archive</a:Name>
<a:Code>archive</a:Code>
<a:CreationDate>1572451531</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572451544</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
</o:Event>
</c:Events>
<c:TargetModels>
<o:TargetModel Id="o70">
<a:ObjectID>04A6C43B-F51A-4BE5-BDA6-C69152894A5F</a:ObjectID>
<a:Name>Java</a:Name>
<a:Code>Java</a:Code>
<a:CreationDate>1572450200</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450200</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<a:TargetModelURL>file:///%_OBJLANG%/java5-j2ee14.xol</a:TargetModelURL>
<a:TargetModelID>0DEDDB90-46E2-45A0-886E-411709DA0DC9</a:TargetModelID>
<a:TargetModelClassID>1811206C-1A4B-11D1-83D9-444553540000</a:TargetModelClassID>
<c:SessionShortcuts>
<o:Shortcut Ref="o3"/>
</c:SessionShortcuts>
</o:TargetModel>
<o:TargetModel Id="o71">
<a:ObjectID>5F9EBCD4-C830-4BA1-849A-C5B2312AC242</a:ObjectID>
<a:Name>WSDL for Java</a:Name>
<a:Code>WSDLJava</a:Code>
<a:CreationDate>1572450200</a:CreationDate>
<a:Creator>IN-MP-040</a:Creator>
<a:ModificationDate>1572450200</a:ModificationDate>
<a:Modifier>IN-MP-040</a:Modifier>
<a:TargetModelURL>file:///%_XEM%/WSDLJ2EE.xem</a:TargetModelURL>
<a:TargetModelID>C8F5F7B2-CF9D-4E98-8301-959BB6E86C8A</a:TargetModelID>
<a:TargetModelClassID>186C8AC3-D3DC-11D3-881C-00508B03C75C</a:TargetModelClassID>
<c:SessionShortcuts>
<o:Shortcut Ref="o4"/>
</c:SessionShortcuts>
</o:TargetModel>
</c:TargetModels>
</o:Model>
</c:Children>
</o:RootObject>

</Model>