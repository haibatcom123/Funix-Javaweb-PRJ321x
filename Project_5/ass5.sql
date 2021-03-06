USE [Funix_SendMail]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 5/27/2021 9:41:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[categoryID] [int] NOT NULL,
	[categoryName] [nvarchar](50) NOT NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[User]    Script Date: 5/27/2021 9:41:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[User](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[username] [varchar](255) NOT NULL,
	[password] [varchar](255) NOT NULL,
 CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[User] ON 

INSERT [dbo].[User] ([id], [username], [password]) VALUES (1, N'admin@gmail.com', N'123')
INSERT [dbo].[User] ([id], [username], [password]) VALUES (2, N'123haibatcom@gmail.com', N'ohyes123')
INSERT [dbo].[User] ([id], [username], [password]) VALUES (3, N'truonghdFX10652@funix.edu.vn', N'Nz1I05JWEQsX')
SET IDENTITY_INSERT [dbo].[User] OFF
