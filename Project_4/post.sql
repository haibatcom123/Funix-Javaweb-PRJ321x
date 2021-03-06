create database post
USE [post]
GO
/****** Object:  Table [dbo].[Article]    Script Date: 4/13/2020 2:23:18 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Article](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[title] [nvarchar](max) NULL,
	[shortDes] [nvarchar](max) NULL,
	[detailDes] [nvarchar](max) NULL,
	[timePost] [datetime] NULL,
	[categoryId] [int] NOT NULL,
	[author] [int] NULL,
 CONSTRAINT [PK_Article_1] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[author]    Script Date: 4/13/2020 2:23:18 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[author](
	[id] [int] NOT NULL,
	[username] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NULL,
 CONSTRAINT [PK_author] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 4/13/2020 2:23:18 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[categoryID] [int] NOT NULL,
	[categoryName] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Article] ON 

INSERT [dbo].[Article] ([id], [title], [shortDes], [detailDes], [timePost], [categoryId], [author]) VALUES (1, N'When designing a database, you can add a category to an article; However, this is not a compulsory requirement.', N'Post''s content in the database can be either: text in the form of markdown or HTML for formatting. For each format, you need to find the appropriate API javascript. When designing a database, you can add a category to an article; However, this is not a compulsory requirement.', N'An interface for the reader (reader GUI): 
- PostDetail.jsp: view a single post, anyone can view this page. On this page, there must be a section displaying the message to welcome back-reader. An article contains the title, content, author, and date of publication, status (in draft or published). The content must be in a separate format.

- Posts.jsp: display all published articles, sorting by date of publication.

An interface for the author (author GUI): 
Authoring page: As a writer, I want to write articles, mark them as published or drafts, I also want to format the content myself. For security, I have to log in before accessing this page. The content of the form may look like this:

- If you intend to save the content in html format:', CAST(N'2020-02-02T00:00:00.000' AS DateTime), 1, 1)
INSERT [dbo].[Article] ([id], [title], [shortDes], [detailDes], [timePost], [categoryId], [author]) VALUES (2, N'Authoring page: As a writer, I want to write articles, mark them as published or drafts, I also want to format the content myself. For security, I have to log in before accessing this page', N'You are free to design the table to save the post, the user in the database and the user interface must be responsive.
Post''s content in the database can be either: text in the form of markdown or HTML for formatting. For each format, you need to find the appropriate API javascript.', N'You are free to design the table to save the post, the user in the database and the user interface must be responsive.
Post''s content in the database can be either: text in the form of markdown or HTML for formatting. For each format, you need to find the appropriate API javascript.', CAST(N'2020-01-02T00:00:00.000' AS DateTime), 2, 2)
INSERT [dbo].[Article] ([id], [title], [shortDes], [detailDes], [timePost], [categoryId], [author]) VALUES (3, N'Text containing a date or time should display that date in the local timezone of the person seeing the text. For app-published text', N'The <!date> command will format the timestamp using tokens within a string that you set, and it must include some fallback text for older Slack clients. Here''s the general syntax to use:', N'Text containing a date or time should display that date in the local timezone of the person seeing the text. For app-published text, there is a handy date syntax available to format a Unix timestamp, and Slack will handle the timezone localization for you.

The <!date> command will format the timestamp using tokens within a string that you set, and it must include some fallback text for older Slack clients. Here''s the general syntax to use:', CAST(N'2019-02-02T00:00:00.000' AS DateTime), 3, 3)
INSERT [dbo].[Article] ([id], [title], [shortDes], [detailDes], [timePost], [categoryId], [author]) VALUES (4, N'Above, we explained how to include various types of special syntax in your app-published text', N'What we didn''t mention is that you can just include the same text as a user would post directly in Slack to achieve some of these things. For example, given the following text:', N'For text in layout blocks set a verbatim attribute of your text objects to false. This is actually the default method of processing these text objects.
For the top-level text field, or text in secondary message attachments, you need to include a link_names argument with value of 1 when publishing the message - see the reference docs for the relevant publishing method for more information on how to include this.', CAST(N'2019-01-01T00:00:00.000' AS DateTime), 1, 1)
INSERT [dbo].[Article] ([id], [title], [shortDes], [detailDes], [timePost], [categoryId], [author]) VALUES (5, N'Even with this functionality available, we still recommend that you use the manual methods shown above.', N'This is important because the names of conversations or user groups may change at any time. What was previously a functioning', N'This is important because the names of conversations or user groups may change at any time. What was previously a functioning reference may no longer work. Meanwhile, an ID will always remain the same. The same holds true for special mentions like @here.

Another good reason to disable automatic parsing is to be more explicit about where you want to include links and mentions. This could prevent random text from being unintentionally parsed and turned into one.', CAST(N'2021-02-02T00:00:00.000' AS DateTime), 2, 2)
INSERT [dbo].[Article] ([id], [title], [shortDes], [detailDes], [timePost], [categoryId], [author]) VALUES (6, N'For example, imagine your app passes user input from a third-party service straight into the published text.', N'For example, imagine your app passes user input from a third-party service straight into the published text. Using automatic parsing, if this user text contained a string like @everyone, your app could unintentionally send a notification to the entire workspace.', N'For example, imagine your app passes user input from a third-party service straight into the published text. Using automatic parsing, if this user text contained a string like @everyone, your app could unintentionally send a notification to the entire workspace.

We''ve already deprecated this functionality for user mentions, so always parsing manually will keep you prepared in case automatic parsing is deprecated for other entities like conversations or user groups in the future.', CAST(N'2019-02-02T00:00:00.000' AS DateTime), 3, 3)
INSERT [dbo].[Article] ([id], [title], [shortDes], [detailDes], [timePost], [categoryId], [author]) VALUES (7, N'Notes on retrieving formatted messages
If you''re retrieving messages, we''ve included some extra details', N' This will let you properly format it for display on a different service, or to help your app fully understand the intent of a message.', N'If you''re retrieving messages, we''ve included some extra details in the sections above to help you parse the formatting syntax. This will let you properly format it for display on a different service, or to help your app fully understand the intent of a message. Here are the general steps involved for detecting advanced formatting syntax:', CAST(N'2020-02-02T00:00:00.000' AS DateTime), 1, 1)
INSERT [dbo].[Article] ([id], [title], [shortDes], [detailDes], [timePost], [categoryId], [author]) VALUES (8, N'Beyond formatting
This guide gives a taste of the', N'This guide gives a taste of the possibilities offered by simply formatting and modifying the text included in each app surface.', N'Beyond formatting
This guide gives a taste of the possibilities offered by simply formatting and modifying the text included in each app surface.

But there''s even more you can do to change the visual composition of those app surfaces.

Read our Block Kit guides to learn how to use blocks and block elements to compose complex layouts.', CAST(N'2020-02-03T00:00:00.000' AS DateTime), 2, 2)
INSERT [dbo].[Article] ([id], [title], [shortDes], [detailDes], [timePost], [categoryId], [author]) VALUES (9, N'This is important because the names of conversations or user groups may change at any time. What was previously a functioning', N'This is important because the names of conversations or user groups may change at any time. What was previously a functioning reference may no longer work. Meanwhile, an ID will always remain the same', N'This is important because the names of conversations or user groups may change at any time. What was previously a functioning reference may no longer work. Meanwhile, an ID will always remain the same. The same holds true for special mentions like @here.

Another good reason to disable automatic parsing is to be more explicit about where you want to include links and mentions. This could prevent random text from being unintentionally parsed and turned into one.

For example, imagine your app passes user input from a third-party service straight into the published text. Using automatic parsing, if this user text contained a string like @everyone, your app could unintentionally send a notification to the entire workspace.

We''ve already deprecated this functionality for user mentions, so always parsing manually will keep you prepared in case automatic parsing is deprecated for other entities like conversations or user groups in the future.', CAST(N'2021-02-02T00:00:00.000' AS DateTime), 3, 3)
INSERT [dbo].[Article] ([id], [title], [shortDes], [detailDes], [timePost], [categoryId], [author]) VALUES (10, N'When designing a database, you can add a category to an article; However, this is not a compulsory requirement.', N'You are free to design the table to save the post, the user in the database and the user interface must be responsive.
Post', N's content in the database can be either: text in the form of markdown or HTML for formatting. For each format, you need to find the appropriate API javascript.', CAST(N'2020-04-13T01:52:05.287' AS DateTime), 1, 3)
INSERT [dbo].[Article] ([id], [title], [shortDes], [detailDes], [timePost], [categoryId], [author]) VALUES (11, N'When designing a database, you can add a category to an article; However, this is not a compulsory requirement.', N'You are free to design the table to save the post, the user in the database and the user interface must be responsive.
Post', N's content in the database can be either: text in the form of markdown or HTML for formatting. For each format, you need to find the appropriate API javascript.', CAST(N'2020-04-13T01:52:14.927' AS DateTime), 1, 1)
INSERT [dbo].[Article] ([id], [title], [shortDes], [detailDes], [timePost], [categoryId], [author]) VALUES (12, N'When designing a database, you can add a category to an article; However, this is not a compulsory requirement.', N'You are free to design the table to save the post, the user in the database and the user interface must be responsive.
Post', N's content in the database can be either: text in the form of markdown or HTML for formatting. For each format, you need to find the appropriate API javascript.', CAST(N'2020-04-13T01:52:40.997' AS DateTime), 1, 1)
INSERT [dbo].[Article] ([id], [title], [shortDes], [detailDes], [timePost], [categoryId], [author]) VALUES (13, N'When designing a database, you can add a category to an article; However, this is not a compulsory requirement.', N'You are free to design the table to save the post, the user in the database and the user interface must be responsive.
Post', N's content in the database can be either: text in the form of markdown or HTML for formatting. For each format, you need to find the appropriate API javascript.', CAST(N'2020-04-13T01:52:45.040' AS DateTime), 1, 2)
INSERT [dbo].[Article] ([id], [title], [shortDes], [detailDes], [timePost], [categoryId], [author]) VALUES (14, N'You cannot alter a column to be an IDENTITY column', N'You cannot alter a column to be an IDENTITY column. What you''ll need to do is create a new column which is defined as an IDENTITY from the get-go, then drop the old', N'If table data is small, this option works gret. If table is large, there''s another option I prefer: use ALTER TABLE ... SWITCH to replace the table schema with another version with an IDENTITY column but otherwise identical schema. The advantage of the ALTER TABLE.... SWITCH approach is that it completes quickly (under 5 seconds for a billion-row table) since no table data needs to be copied or changed. There are caveats and limitations though. See my answer below for details', CAST(N'2020-04-13T02:06:29.303' AS DateTime), 2, 1)
SET IDENTITY_INSERT [dbo].[Article] OFF
INSERT [dbo].[author] ([id], [username], [password]) VALUES (1, N'Obama', N'123')
INSERT [dbo].[author] ([id], [username], [password]) VALUES (2, N'Donal', N'123')
INSERT [dbo].[author] ([id], [username], [password]) VALUES (3, N'Bill', N'123')
INSERT [dbo].[Category] ([categoryID], [categoryName]) VALUES (1, N'Chân')
INSERT [dbo].[Category] ([categoryID], [categoryName]) VALUES (2, N'Thiện')
INSERT [dbo].[Category] ([categoryID], [categoryName]) VALUES (3, N'Mỹ')
