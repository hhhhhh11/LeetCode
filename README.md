
bomb：     文件格式 elf32-i386


Disassembly of section .init:

080486f4 <_init>:
 80486f4:	53                   	push   %ebx
 80486f5:	83 ec 08             	sub    $0x8,%esp
 80486f8:	e8 13 02 00 00       	call   8048910 <__x86.get_pc_thunk.bx>
 80486fd:	81 c3 03 39 00 00    	add    $0x3903,%ebx
 8048703:	8b 83 fc ff ff ff    	mov    -0x4(%ebx),%eax
 8048709:	85 c0                	test   %eax,%eax
 804870b:	74 05                	je     8048712 <_init+0x1e>
 804870d:	e8 be 01 00 00       	call   80488d0 <__sprintf_chk@plt+0x10>
 8048712:	83 c4 08             	add    $0x8,%esp
 8048715:	5b                   	pop    %ebx
 8048716:	c3                   	ret    

Disassembly of section .plt:

08048720 <read@plt-0x10>:
 8048720:	ff 35 04 c0 04 08    	pushl  0x804c004
 8048726:	ff 25 08 c0 04 08    	jmp    *0x804c008
 804872c:	00 00                	add    %al,(%eax)
	...

08048730 <read@plt>:
 8048730:	ff 25 0c c0 04 08    	jmp    *0x804c00c
 8048736:	68 00 00 00 00       	push   $0x0
 804873b:	e9 e0 ff ff ff       	jmp    8048720 <_init+0x2c>

08048740 <fflush@plt>:
 8048740:	ff 25 10 c0 04 08    	jmp    *0x804c010
 8048746:	68 08 00 00 00       	push   $0x8
 804874b:	e9 d0 ff ff ff       	jmp    8048720 <_init+0x2c>

08048750 <fgets@plt>:
 8048750:	ff 25 14 c0 04 08    	jmp    *0x804c014
 8048756:	68 10 00 00 00       	push   $0x10
 804875b:	e9 c0 ff ff ff       	jmp    8048720 <_init+0x2c>

08048760 <signal@plt>:
 8048760:	ff 25 18 c0 04 08    	jmp    *0x804c018
 8048766:	68 18 00 00 00       	push   $0x18
 804876b:	e9 b0 ff ff ff       	jmp    8048720 <_init+0x2c>

08048770 <sleep@plt>:
 8048770:	ff 25 1c c0 04 08    	jmp    *0x804c01c
 8048776:	68 20 00 00 00       	push   $0x20
 804877b:	e9 a0 ff ff ff       	jmp    8048720 <_init+0x2c>

08048780 <alarm@plt>:
 8048780:	ff 25 20 c0 04 08    	jmp    *0x804c020
 8048786:	68 28 00 00 00       	push   $0x28
 804878b:	e9 90 ff ff ff       	jmp    8048720 <_init+0x2c>

08048790 <__stack_chk_fail@plt>:
 8048790:	ff 25 24 c0 04 08    	jmp    *0x804c024
 8048796:	68 30 00 00 00       	push   $0x30
 804879b:	e9 80 ff ff ff       	jmp    8048720 <_init+0x2c>

080487a0 <strcpy@plt>:
 80487a0:	ff 25 28 c0 04 08    	jmp    *0x804c028
 80487a6:	68 38 00 00 00       	push   $0x38
 80487ab:	e9 70 ff ff ff       	jmp    8048720 <_init+0x2c>

080487b0 <getenv@plt>:
 80487b0:	ff 25 2c c0 04 08    	jmp    *0x804c02c
 80487b6:	68 40 00 00 00       	push   $0x40
 80487bb:	e9 60 ff ff ff       	jmp    8048720 <_init+0x2c>

080487c0 <puts@plt>:
 80487c0:	ff 25 30 c0 04 08    	jmp    *0x804c030
 80487c6:	68 48 00 00 00       	push   $0x48
 80487cb:	e9 50 ff ff ff       	jmp    8048720 <_init+0x2c>

080487d0 <__memmove_chk@plt>:
 80487d0:	ff 25 34 c0 04 08    	jmp    *0x804c034
 80487d6:	68 50 00 00 00       	push   $0x50
 80487db:	e9 40 ff ff ff       	jmp    8048720 <_init+0x2c>

080487e0 <exit@plt>:
 80487e0:	ff 25 38 c0 04 08    	jmp    *0x804c038
 80487e6:	68 58 00 00 00       	push   $0x58
 80487eb:	e9 30 ff ff ff       	jmp    8048720 <_init+0x2c>

080487f0 <__libc_start_main@plt>:
 80487f0:	ff 25 3c c0 04 08    	jmp    *0x804c03c
 80487f6:	68 60 00 00 00       	push   $0x60
 80487fb:	e9 20 ff ff ff       	jmp    8048720 <_init+0x2c>

08048800 <write@plt>:
 8048800:	ff 25 40 c0 04 08    	jmp    *0x804c040
 8048806:	68 68 00 00 00       	push   $0x68
 804880b:	e9 10 ff ff ff       	jmp    8048720 <_init+0x2c>

08048810 <__isoc99_sscanf@plt>:
 8048810:	ff 25 44 c0 04 08    	jmp    *0x804c044
 8048816:	68 70 00 00 00       	push   $0x70
 804881b:	e9 00 ff ff ff       	jmp    8048720 <_init+0x2c>

08048820 <fopen@plt>:
 8048820:	ff 25 48 c0 04 08    	jmp    *0x804c048
 8048826:	68 78 00 00 00       	push   $0x78
 804882b:	e9 f0 fe ff ff       	jmp    8048720 <_init+0x2c>

08048830 <__errno_location@plt>:
 8048830:	ff 25 4c c0 04 08    	jmp    *0x804c04c
 8048836:	68 80 00 00 00       	push   $0x80
 804883b:	e9 e0 fe ff ff       	jmp    8048720 <_init+0x2c>

08048840 <__printf_chk@plt>:
 8048840:	ff 25 50 c0 04 08    	jmp    *0x804c050
 8048846:	68 88 00 00 00       	push   $0x88
 804884b:	e9 d0 fe ff ff       	jmp    8048720 <_init+0x2c>

08048850 <socket@plt>:
 8048850:	ff 25 54 c0 04 08    	jmp    *0x804c054
 8048856:	68 90 00 00 00       	push   $0x90
 804885b:	e9 c0 fe ff ff       	jmp    8048720 <_init+0x2c>

08048860 <__fprintf_chk@plt>:
 8048860:	ff 25 58 c0 04 08    	jmp    *0x804c058
 8048866:	68 98 00 00 00       	push   $0x98
 804886b:	e9 b0 fe ff ff       	jmp    8048720 <_init+0x2c>

08048870 <gethostbyname@plt>:
 8048870:	ff 25 5c c0 04 08    	jmp    *0x804c05c
 8048876:	68 a0 00 00 00       	push   $0xa0
 804887b:	e9 a0 fe ff ff       	jmp    8048720 <_init+0x2c>

08048880 <strtol@plt>:
 8048880:	ff 25 60 c0 04 08    	jmp    *0x804c060
 8048886:	68 a8 00 00 00       	push   $0xa8
 804888b:	e9 90 fe ff ff       	jmp    8048720 <_init+0x2c>

08048890 <connect@plt>:
 8048890:	ff 25 64 c0 04 08    	jmp    *0x804c064
 8048896:	68 b0 00 00 00       	push   $0xb0
 804889b:	e9 80 fe ff ff       	jmp    8048720 <_init+0x2c>

080488a0 <close@plt>:
 80488a0:	ff 25 68 c0 04 08    	jmp    *0x804c068
 80488a6:	68 b8 00 00 00       	push   $0xb8
 80488ab:	e9 70 fe ff ff       	jmp    8048720 <_init+0x2c>

080488b0 <__ctype_b_loc@plt>:
 80488b0:	ff 25 6c c0 04 08    	jmp    *0x804c06c
 80488b6:	68 c0 00 00 00       	push   $0xc0
 80488bb:	e9 60 fe ff ff       	jmp    8048720 <_init+0x2c>

080488c0 <__sprintf_chk@plt>:
 80488c0:	ff 25 70 c0 04 08    	jmp    *0x804c070
 80488c6:	68 c8 00 00 00       	push   $0xc8
 80488cb:	e9 50 fe ff ff       	jmp    8048720 <_init+0x2c>

Disassembly of section .plt.got:

080488d0 <.plt.got>:
 80488d0:	ff 25 fc bf 04 08    	jmp    *0x804bffc
 80488d6:	66 90                	xchg   %ax,%ax

Disassembly of section .text:

080488e0 <_start>:
 80488e0:	31 ed                	xor    %ebp,%ebp
 80488e2:	5e                   	pop    %esi
 80488e3:	89 e1                	mov    %esp,%ecx
 80488e5:	83 e4 f0             	and    $0xfffffff0,%esp
 80488e8:	50                   	push   %eax
 80488e9:	54                   	push   %esp
 80488ea:	52                   	push   %edx
 80488eb:	68 60 9e 04 08       	push   $0x8049e60
 80488f0:	68 00 9e 04 08       	push   $0x8049e00
 80488f5:	51                   	push   %ecx
 80488f6:	56                   	push   %esi
 80488f7:	68 db 89 04 08       	push   $0x80489db
 80488fc:	e8 ef fe ff ff       	call   80487f0 <__libc_start_main@plt>
 8048901:	f4                   	hlt    
 8048902:	66 90                	xchg   %ax,%ax
 8048904:	66 90                	xchg   %ax,%ax
 8048906:	66 90                	xchg   %ax,%ax
 8048908:	66 90                	xchg   %ax,%ax
 804890a:	66 90                	xchg   %ax,%ax
 804890c:	66 90                	xchg   %ax,%ax
 804890e:	66 90                	xchg   %ax,%ax

08048910 <__x86.get_pc_thunk.bx>:
 8048910:	8b 1c 24             	mov    (%esp),%ebx
 8048913:	c3                   	ret    
 8048914:	66 90                	xchg   %ax,%ax
 8048916:	66 90                	xchg   %ax,%ax
 8048918:	66 90                	xchg   %ax,%ax
 804891a:	66 90                	xchg   %ax,%ax
 804891c:	66 90                	xchg   %ax,%ax
 804891e:	66 90                	xchg   %ax,%ax

08048920 <deregister_tm_clones>:
 8048920:	b8 a3 c3 04 08       	mov    $0x804c3a3,%eax
 8048925:	2d a0 c3 04 08       	sub    $0x804c3a0,%eax
 804892a:	83 f8 06             	cmp    $0x6,%eax
 804892d:	76 1a                	jbe    8048949 <deregister_tm_clones+0x29>
 804892f:	b8 00 00 00 00       	mov    $0x0,%eax
 8048934:	85 c0                	test   %eax,%eax
 8048936:	74 11                	je     8048949 <deregister_tm_clones+0x29>
 8048938:	55                   	push   %ebp
 8048939:	89 e5                	mov    %esp,%ebp
 804893b:	83 ec 14             	sub    $0x14,%esp
 804893e:	68 a0 c3 04 08       	push   $0x804c3a0
 8048943:	ff d0                	call   *%eax
 8048945:	83 c4 10             	add    $0x10,%esp
 8048948:	c9                   	leave  
 8048949:	f3 c3                	repz ret 
 804894b:	90                   	nop
 804894c:	8d 74 26 00          	lea    0x0(%esi,%eiz,1),%esi

08048950 <register_tm_clones>:
 8048950:	b8 a0 c3 04 08       	mov    $0x804c3a0,%eax
 8048955:	2d a0 c3 04 08       	sub    $0x804c3a0,%eax
 804895a:	c1 f8 02             	sar    $0x2,%eax
 804895d:	89 c2                	mov    %eax,%edx
 804895f:	c1 ea 1f             	shr    $0x1f,%edx
 8048962:	01 d0                	add    %edx,%eax
 8048964:	d1 f8                	sar    %eax
 8048966:	74 1b                	je     8048983 <register_tm_clones+0x33>
 8048968:	ba 00 00 00 00       	mov    $0x0,%edx
 804896d:	85 d2                	test   %edx,%edx
 804896f:	74 12                	je     8048983 <register_tm_clones+0x33>
 8048971:	55                   	push   %ebp
 8048972:	89 e5                	mov    %esp,%ebp
 8048974:	83 ec 10             	sub    $0x10,%esp
 8048977:	50                   	push   %eax
 8048978:	68 a0 c3 04 08       	push   $0x804c3a0
 804897d:	ff d2                	call   *%edx
 804897f:	83 c4 10             	add    $0x10,%esp
 8048982:	c9                   	leave  
 8048983:	f3 c3                	repz ret 
 8048985:	8d 74 26 00          	lea    0x0(%esi,%eiz,1),%esi
 8048989:	8d bc 27 00 00 00 00 	lea    0x0(%edi,%eiz,1),%edi

08048990 <__do_global_dtors_aux>:
 8048990:	80 3d c8 c3 04 08 00 	cmpb   $0x0,0x804c3c8
 8048997:	75 13                	jne    80489ac <__do_global_dtors_aux+0x1c>
 8048999:	55                   	push   %ebp
 804899a:	89 e5                	mov    %esp,%ebp
 804899c:	83 ec 08             	sub    $0x8,%esp
 804899f:	e8 7c ff ff ff       	call   8048920 <deregister_tm_clones>
 80489a4:	c6 05 c8 c3 04 08 01 	movb   $0x1,0x804c3c8
 80489ab:	c9                   	leave  
 80489ac:	f3 c3                	repz ret 
 80489ae:	66 90                	xchg   %ax,%ax

080489b0 <frame_dummy>:
 80489b0:	b8 10 bf 04 08       	mov    $0x804bf10,%eax
 80489b5:	8b 10                	mov    (%eax),%edx
 80489b7:	85 d2                	test   %edx,%edx
 80489b9:	75 05                	jne    80489c0 <frame_dummy+0x10>
 80489bb:	eb 93                	jmp    8048950 <register_tm_clones>
 80489bd:	8d 76 00             	lea    0x0(%esi),%esi
 80489c0:	ba 00 00 00 00       	mov    $0x0,%edx
 80489c5:	85 d2                	test   %edx,%edx
 80489c7:	74 f2                	je     80489bb <frame_dummy+0xb>
 80489c9:	55                   	push   %ebp
 80489ca:	89 e5                	mov    %esp,%ebp
 80489cc:	83 ec 14             	sub    $0x14,%esp
 80489cf:	50                   	push   %eax
 80489d0:	ff d2                	call   *%edx
 80489d2:	83 c4 10             	add    $0x10,%esp
 80489d5:	c9                   	leave  
 80489d6:	e9 75 ff ff ff       	jmp    8048950 <register_tm_clones>

080489db <main>:
 80489db:	8d 4c 24 04          	lea    0x4(%esp),%ecx
 80489df:	83 e4 f0             	and    $0xfffffff0,%esp
 80489e2:	ff 71 fc             	pushl  -0x4(%ecx)
 80489e5:	55                   	push   %ebp
 80489e6:	89 e5                	mov    %esp,%ebp
 80489e8:	53                   	push   %ebx
 80489e9:	51                   	push   %ecx
 80489ea:	8b 01                	mov    (%ecx),%eax
 80489ec:	8b 59 04             	mov    0x4(%ecx),%ebx
 80489ef:	83 f8 01             	cmp    $0x1,%eax
 80489f2:	0f 84 01 01 00 00    	je     8048af9 <main+0x11e>
 80489f8:	83 f8 02             	cmp    $0x2,%eax
 80489fb:	0f 85 24 01 00 00    	jne    8048b25 <main+0x14a>
 8048a01:	83 ec 08             	sub    $0x8,%esp
 8048a04:	68 88 9e 04 08       	push   $0x8049e88
 8048a09:	ff 73 04             	pushl  0x4(%ebx)
 8048a0c:	e8 0f fe ff ff       	call   8048820 <fopen@plt>
 8048a11:	a3 d0 c3 04 08       	mov    %eax,0x804c3d0
 8048a16:	83 c4 10             	add    $0x10,%esp
 8048a19:	85 c0                	test   %eax,%eax
 8048a1b:	0f 84 e7 00 00 00    	je     8048b08 <main+0x12d>
 8048a21:	e8 06 06 00 00       	call   804902c <initialize_bomb>
 8048a26:	83 ec 0c             	sub    $0xc,%esp
 8048a29:	68 0c 9f 04 08       	push   $0x8049f0c
 8048a2e:	e8 8d fd ff ff       	call   80487c0 <puts@plt>
 8048a33:	c7 04 24 48 9f 04 08 	movl   $0x8049f48,(%esp)
 8048a3a:	e8 81 fd ff ff       	call   80487c0 <puts@plt>
 8048a3f:	e8 d8 06 00 00       	call   804911c <read_line>
 8048a44:	89 04 24             	mov    %eax,(%esp)
 8048a47:	e8 f6 00 00 00       	call   8048b42 <phase_1>
 8048a4c:	e8 ca 07 00 00       	call   804921b <phase_defused>
 8048a51:	c7 04 24 74 9f 04 08 	movl   $0x8049f74,(%esp)
 8048a58:	e8 63 fd ff ff       	call   80487c0 <puts@plt>
 8048a5d:	e8 ba 06 00 00       	call   804911c <read_line>
 8048a62:	89 04 24             	mov    %eax,(%esp)
 8048a65:	e8 fb 00 00 00       	call   8048b65 <phase_2>
 8048a6a:	e8 ac 07 00 00       	call   804921b <phase_defused>
 8048a6f:	c7 04 24 c1 9e 04 08 	movl   $0x8049ec1,(%esp)
 8048a76:	e8 45 fd ff ff       	call   80487c0 <puts@plt>
 8048a7b:	e8 9c 06 00 00       	call   804911c <read_line>
 8048a80:	89 04 24             	mov    %eax,(%esp)
 8048a83:	e8 44 01 00 00       	call   8048bcc <phase_3>
 8048a88:	e8 8e 07 00 00       	call   804921b <phase_defused>
 8048a8d:	c7 04 24 df 9e 04 08 	movl   $0x8049edf,(%esp)
 8048a94:	e8 27 fd ff ff       	call   80487c0 <puts@plt>
 8048a99:	e8 7e 06 00 00       	call   804911c <read_line>
 8048a9e:	89 04 24             	mov    %eax,(%esp)
 8048aa1:	e8 30 02 00 00       	call   8048cd6 <phase_4>
 8048aa6:	e8 70 07 00 00       	call   804921b <phase_defused>
 8048aab:	c7 04 24 a0 9f 04 08 	movl   $0x8049fa0,(%esp)
 8048ab2:	e8 09 fd ff ff       	call   80487c0 <puts@plt>
 8048ab7:	e8 60 06 00 00       	call   804911c <read_line>
 8048abc:	89 04 24             	mov    %eax,(%esp)
 8048abf:	e8 8b 02 00 00       	call   8048d4f <phase_5>
 8048ac4:	e8 52 07 00 00       	call   804921b <phase_defused>
 8048ac9:	c7 04 24 ee 9e 04 08 	movl   $0x8049eee,(%esp)
 8048ad0:	e8 eb fc ff ff       	call   80487c0 <puts@plt>
 8048ad5:	e8 42 06 00 00       	call   804911c <read_line>
 8048ada:	89 04 24             	mov    %eax,(%esp)
 8048add:	e8 b5 02 00 00       	call   8048d97 <phase_6>
 8048ae2:	e8 34 07 00 00       	call   804921b <phase_defused>
 8048ae7:	83 c4 10             	add    $0x10,%esp
 8048aea:	b8 00 00 00 00       	mov    $0x0,%eax
 8048aef:	8d 65 f8             	lea    -0x8(%ebp),%esp
 8048af2:	59                   	pop    %ecx
 8048af3:	5b                   	pop    %ebx
 8048af4:	5d                   	pop    %ebp
 8048af5:	8d 61 fc             	lea    -0x4(%ecx),%esp
 8048af8:	c3                   	ret    
 8048af9:	a1 c0 c3 04 08       	mov    0x804c3c0,%eax
 8048afe:	a3 d0 c3 04 08       	mov    %eax,0x804c3d0
 8048b03:	e9 19 ff ff ff       	jmp    8048a21 <main+0x46>
 8048b08:	ff 73 04             	pushl  0x4(%ebx)
 8048b0b:	ff 33                	pushl  (%ebx)
 8048b0d:	68 8a 9e 04 08       	push   $0x8049e8a
 8048b12:	6a 01                	push   $0x1
 8048b14:	e8 27 fd ff ff       	call   8048840 <__printf_chk@plt>
 8048b19:	c7 04 24 08 00 00 00 	movl   $0x8,(%esp)
 8048b20:	e8 bb fc ff ff       	call   80487e0 <exit@plt>
 8048b25:	83 ec 04             	sub    $0x4,%esp
 8048b28:	ff 33                	pushl  (%ebx)
 8048b2a:	68 a7 9e 04 08       	push   $0x8049ea7
 8048b2f:	6a 01                	push   $0x1
 8048b31:	e8 0a fd ff ff       	call   8048840 <__printf_chk@plt>
 8048b36:	c7 04 24 08 00 00 00 	movl   $0x8,(%esp)
 8048b3d:	e8 9e fc ff ff       	call   80487e0 <exit@plt>

08048b42 <phase_1>:
 8048b42:	83 ec 14             	sub    $0x14,%esp
 8048b45:	68 c4 9f 04 08       	push   $0x8049fc4
 8048b4a:	ff 74 24 1c          	pushl  0x1c(%esp)
 8048b4e:	e8 74 04 00 00       	call   8048fc7 <strings_not_equal>
 8048b53:	83 c4 10             	add    $0x10,%esp
 8048b56:	85 c0                	test   %eax,%eax
 8048b58:	75 04                	jne    8048b5e <phase_1+0x1c>
 8048b5a:	83 c4 0c             	add    $0xc,%esp
 8048b5d:	c3                   	ret    
 8048b5e:	e8 59 05 00 00       	call   80490bc <explode_bomb>
 8048b63:	eb f5                	jmp    8048b5a <phase_1+0x18>

08048b65 <phase_2>:
 8048b65:	53                   	push   %ebx
 8048b66:	83 ec 30             	sub    $0x30,%esp
 8048b69:	65 a1 14 00 00 00    	mov    %gs:0x14,%eax
 8048b6f:	89 44 24 24          	mov    %eax,0x24(%esp)
 8048b73:	31 c0                	xor    %eax,%eax
 8048b75:	8d 44 24 0c          	lea    0xc(%esp),%eax
 8048b79:	50                   	push   %eax
 8048b7a:	ff 74 24 3c          	pushl  0x3c(%esp)
 8048b7e:	e8 5e 05 00 00       	call   80490e1 <read_six_numbers>
 8048b83:	83 c4 10             	add    $0x10,%esp
 8048b86:	83 7c 24 04 00       	cmpl   $0x0,0x4(%esp)
 8048b8b:	78 07                	js     8048b94 <phase_2+0x2f>
 8048b8d:	bb 01 00 00 00       	mov    $0x1,%ebx
 8048b92:	eb 0f                	jmp    8048ba3 <phase_2+0x3e>
 8048b94:	e8 23 05 00 00       	call   80490bc <explode_bomb>
 8048b99:	eb f2                	jmp    8048b8d <phase_2+0x28>
 8048b9b:	83 c3 01             	add    $0x1,%ebx
 8048b9e:	83 fb 06             	cmp    $0x6,%ebx
 8048ba1:	74 12                	je     8048bb5 <phase_2+0x50>
 8048ba3:	89 d8                	mov    %ebx,%eax
 8048ba5:	03 04 9c             	add    (%esp,%ebx,4),%eax
 8048ba8:	39 44 9c 04          	cmp    %eax,0x4(%esp,%ebx,4)
 8048bac:	74 ed                	je     8048b9b <phase_2+0x36>
 8048bae:	e8 09 05 00 00       	call   80490bc <explode_bomb>
 8048bb3:	eb e6                	jmp    8048b9b <phase_2+0x36>
 8048bb5:	8b 44 24 1c          	mov    0x1c(%esp),%eax
 8048bb9:	65 33 05 14 00 00 00 	xor    %gs:0x14,%eax
 8048bc0:	75 05                	jne    8048bc7 <phase_2+0x62>
 8048bc2:	83 c4 28             	add    $0x28,%esp
 8048bc5:	5b                   	pop    %ebx
 8048bc6:	c3                   	ret    
 8048bc7:	e8 c4 fb ff ff       	call   8048790 <__stack_chk_fail@plt>

08048bcc <phase_3>:
 8048bcc:	83 ec 1c             	sub    $0x1c,%esp
 8048bcf:	65 a1 14 00 00 00    	mov    %gs:0x14,%eax
 8048bd5:	89 44 24 0c          	mov    %eax,0xc(%esp)
 8048bd9:	31 c0                	xor    %eax,%eax
 8048bdb:	8d 44 24 08          	lea    0x8(%esp),%eax
 8048bdf:	50                   	push   %eax
 8048be0:	8d 44 24 08          	lea    0x8(%esp),%eax
 8048be4:	50                   	push   %eax
 8048be5:	68 8f a1 04 08       	push   $0x804a18f
 8048bea:	ff 74 24 2c          	pushl  0x2c(%esp)
 8048bee:	e8 1d fc ff ff       	call   8048810 <__isoc99_sscanf@plt>
 8048bf3:	83 c4 10             	add    $0x10,%esp
 8048bf6:	83 f8 01             	cmp    $0x1,%eax
 8048bf9:	7e 12                	jle    8048c0d <phase_3+0x41>
 8048bfb:	83 7c 24 04 07       	cmpl   $0x7,0x4(%esp)
 8048c00:	77 43                	ja     8048c45 <phase_3+0x79>
 8048c02:	8b 44 24 04          	mov    0x4(%esp),%eax
 8048c06:	ff 24 85 20 a0 04 08 	jmp    *0x804a020(,%eax,4)
 8048c0d:	e8 aa 04 00 00       	call   80490bc <explode_bomb>
 8048c12:	eb e7                	jmp    8048bfb <phase_3+0x2f>
 8048c14:	b8 5b 02 00 00       	mov    $0x25b,%eax
 8048c19:	eb 3b                	jmp    8048c56 <phase_3+0x8a>
 8048c1b:	b8 3d 01 00 00       	mov    $0x13d,%eax
 8048c20:	eb 34                	jmp    8048c56 <phase_3+0x8a>
 8048c22:	b8 83 00 00 00       	mov    $0x83,%eax
 8048c27:	eb 2d                	jmp    8048c56 <phase_3+0x8a>
 8048c29:	b8 e7 02 00 00       	mov    $0x2e7,%eax
 8048c2e:	eb 26                	jmp    8048c56 <phase_3+0x8a>
 8048c30:	b8 f4 01 00 00       	mov    $0x1f4,%eax
 8048c35:	eb 1f                	jmp    8048c56 <phase_3+0x8a>
 8048c37:	b8 5c 00 00 00       	mov    $0x5c,%eax
 8048c3c:	eb 18                	jmp    8048c56 <phase_3+0x8a>
 8048c3e:	b8 7e 03 00 00       	mov    $0x37e,%eax
 8048c43:	eb 11                	jmp    8048c56 <phase_3+0x8a>
 8048c45:	e8 72 04 00 00       	call   80490bc <explode_bomb>
 8048c4a:	b8 00 00 00 00       	mov    $0x0,%eax
 8048c4f:	eb 05                	jmp    8048c56 <phase_3+0x8a>
 8048c51:	b8 a3 01 00 00       	mov    $0x1a3,%eax
 8048c56:	3b 44 24 08          	cmp    0x8(%esp),%eax
 8048c5a:	74 05                	je     8048c61 <phase_3+0x95>
 8048c5c:	e8 5b 04 00 00       	call   80490bc <explode_bomb>
 8048c61:	8b 44 24 0c          	mov    0xc(%esp),%eax
 8048c65:	65 33 05 14 00 00 00 	xor    %gs:0x14,%eax
 8048c6c:	75 04                	jne    8048c72 <phase_3+0xa6>
 8048c6e:	83 c4 1c             	add    $0x1c,%esp
 8048c71:	c3                   	ret    
 8048c72:	e8 19 fb ff ff       	call   8048790 <__stack_chk_fail@plt>

08048c77 <func4>:
 8048c77:	56                   	push   %esi
 8048c78:	53                   	push   %ebx
 8048c79:	83 ec 04             	sub    $0x4,%esp
 8048c7c:	8b 4c 24 10          	mov    0x10(%esp),%ecx
 8048c80:	8b 44 24 14          	mov    0x14(%esp),%eax
 8048c84:	8b 5c 24 18          	mov    0x18(%esp),%ebx
 8048c88:	89 de                	mov    %ebx,%esi
 8048c8a:	29 c6                	sub    %eax,%esi
 8048c8c:	89 f2                	mov    %esi,%edx
 8048c8e:	c1 ea 1f             	shr    $0x1f,%edx
 8048c91:	01 f2                	add    %esi,%edx
 8048c93:	d1 fa                	sar    %edx
 8048c95:	01 c2                	add    %eax,%edx
 8048c97:	39 ca                	cmp    %ecx,%edx
 8048c99:	7f 0f                	jg     8048caa <func4+0x33>
 8048c9b:	b8 00 00 00 00       	mov    $0x0,%eax
 8048ca0:	39 ca                	cmp    %ecx,%edx
 8048ca2:	7c 1b                	jl     8048cbf <func4+0x48>
 8048ca4:	83 c4 04             	add    $0x4,%esp
 8048ca7:	5b                   	pop    %ebx
 8048ca8:	5e                   	pop    %esi
 8048ca9:	c3                   	ret    
 8048caa:	83 ec 04             	sub    $0x4,%esp
 8048cad:	83 ea 01             	sub    $0x1,%edx
 8048cb0:	52                   	push   %edx
 8048cb1:	50                   	push   %eax
 8048cb2:	51                   	push   %ecx
 8048cb3:	e8 bf ff ff ff       	call   8048c77 <func4>
 8048cb8:	83 c4 10             	add    $0x10,%esp
 8048cbb:	01 c0                	add    %eax,%eax
 8048cbd:	eb e5                	jmp    8048ca4 <func4+0x2d>
 8048cbf:	83 ec 04             	sub    $0x4,%esp
 8048cc2:	53                   	push   %ebx
 8048cc3:	83 c2 01             	add    $0x1,%edx
 8048cc6:	52                   	push   %edx
 8048cc7:	51                   	push   %ecx
 8048cc8:	e8 aa ff ff ff       	call   8048c77 <func4>
 8048ccd:	83 c4 10             	add    $0x10,%esp
 8048cd0:	8d 44 00 01          	lea    0x1(%eax,%eax,1),%eax
 8048cd4:	eb ce                	jmp    8048ca4 <func4+0x2d>

08048cd6 <phase_4>:
 8048cd6:	83 ec 1c             	sub    $0x1c,%esp
 8048cd9:	65 a1 14 00 00 00    	mov    %gs:0x14,%eax
 8048cdf:	89 44 24 0c          	mov    %eax,0xc(%esp)
 8048ce3:	31 c0                	xor    %eax,%eax
 8048ce5:	8d 44 24 08          	lea    0x8(%esp),%eax
 8048ce9:	50                   	push   %eax
 8048cea:	8d 44 24 08          	lea    0x8(%esp),%eax
 8048cee:	50                   	push   %eax
 8048cef:	68 8f a1 04 08       	push   $0x804a18f
 8048cf4:	ff 74 24 2c          	pushl  0x2c(%esp)
 8048cf8:	e8 13 fb ff ff       	call   8048810 <__isoc99_sscanf@plt>
 8048cfd:	83 c4 10             	add    $0x10,%esp
 8048d00:	83 f8 02             	cmp    $0x2,%eax
 8048d03:	74 33                	je     8048d38 <phase_4+0x62>
 8048d05:	e8 b2 03 00 00       	call   80490bc <explode_bomb>
 8048d0a:	83 ec 04             	sub    $0x4,%esp
 8048d0d:	6a 0e                	push   $0xe
 8048d0f:	6a 00                	push   $0x0
 8048d11:	ff 74 24 10          	pushl  0x10(%esp)
 8048d15:	e8 5d ff ff ff       	call   8048c77 <func4>
 8048d1a:	83 c4 10             	add    $0x10,%esp
 8048d1d:	83 f8 05             	cmp    $0x5,%eax
 8048d20:	74 1f                	je     8048d41 <phase_4+0x6b>
 8048d22:	e8 95 03 00 00       	call   80490bc <explode_bomb>
 8048d27:	8b 44 24 0c          	mov    0xc(%esp),%eax
 8048d2b:	65 33 05 14 00 00 00 	xor    %gs:0x14,%eax
 8048d32:	75 16                	jne    8048d4a <phase_4+0x74>
 8048d34:	83 c4 1c             	add    $0x1c,%esp
 8048d37:	c3                   	ret    
 8048d38:	83 7c 24 04 0e       	cmpl   $0xe,0x4(%esp)
 8048d3d:	76 cb                	jbe    8048d0a <phase_4+0x34>
 8048d3f:	eb c4                	jmp    8048d05 <phase_4+0x2f>
 8048d41:	83 7c 24 08 05       	cmpl   $0x5,0x8(%esp)
 8048d46:	75 da                	jne    8048d22 <phase_4+0x4c>
 8048d48:	eb dd                	jmp    8048d27 <phase_4+0x51>
 8048d4a:	e8 41 fa ff ff       	call   8048790 <__stack_chk_fail@plt>

08048d4f <phase_5>:
 8048d4f:	53                   	push   %ebx
 8048d50:	83 ec 14             	sub    $0x14,%esp
 8048d53:	8b 5c 24 1c          	mov    0x1c(%esp),%ebx
 8048d57:	53                   	push   %ebx
 8048d58:	e8 4b 02 00 00       	call   8048fa8 <string_length>
 8048d5d:	83 c4 10             	add    $0x10,%esp
 8048d60:	83 f8 06             	cmp    $0x6,%eax
 8048d63:	74 05                	je     8048d6a <phase_5+0x1b>
 8048d65:	e8 52 03 00 00       	call   80490bc <explode_bomb>
 8048d6a:	89 d8                	mov    %ebx,%eax
 8048d6c:	83 c3 06             	add    $0x6,%ebx
 8048d6f:	b9 00 00 00 00       	mov    $0x0,%ecx
 8048d74:	0f b6 10             	movzbl (%eax),%edx
 8048d77:	83 e2 0f             	and    $0xf,%edx
 8048d7a:	03 0c 95 40 a0 04 08 	add    0x804a040(,%edx,4),%ecx
 8048d81:	83 c0 01             	add    $0x1,%eax
 8048d84:	39 d8                	cmp    %ebx,%eax
 8048d86:	75 ec                	jne    8048d74 <phase_5+0x25>
 8048d88:	83 f9 39             	cmp    $0x39,%ecx
 8048d8b:	74 05                	je     8048d92 <phase_5+0x43>
 8048d8d:	e8 2a 03 00 00       	call   80490bc <explode_bomb>
 8048d92:	83 c4 08             	add    $0x8,%esp
 8048d95:	5b                   	pop    %ebx
 8048d96:	c3                   	ret    

08048d97 <phase_6>:
 8048d97:	56                   	push   %esi
 8048d98:	53                   	push   %ebx
 8048d99:	83 ec 4c             	sub    $0x4c,%esp
 8048d9c:	65 a1 14 00 00 00    	mov    %gs:0x14,%eax
 8048da2:	89 44 24 44          	mov    %eax,0x44(%esp)
 8048da6:	31 c0                	xor    %eax,%eax
 8048da8:	8d 44 24 14          	lea    0x14(%esp),%eax
 8048dac:	50                   	push   %eax
 8048dad:	ff 74 24 5c          	pushl  0x5c(%esp)
 8048db1:	e8 2b 03 00 00       	call   80490e1 <read_six_numbers>
 8048db6:	83 c4 10             	add    $0x10,%esp
 8048db9:	be 00 00 00 00       	mov    $0x0,%esi
 8048dbe:	eb 1c                	jmp    8048ddc <phase_6+0x45>
 8048dc0:	83 c6 01             	add    $0x1,%esi
 8048dc3:	83 fe 06             	cmp    $0x6,%esi
 8048dc6:	74 2e                	je     8048df6 <phase_6+0x5f>
 8048dc8:	89 f3                	mov    %esi,%ebx
 8048dca:	8b 44 9c 0c          	mov    0xc(%esp,%ebx,4),%eax
 8048dce:	39 44 b4 08          	cmp    %eax,0x8(%esp,%esi,4)
 8048dd2:	74 1b                	je     8048def <phase_6+0x58>
 8048dd4:	83 c3 01             	add    $0x1,%ebx
 8048dd7:	83 fb 05             	cmp    $0x5,%ebx
 8048dda:	7e ee                	jle    8048dca <phase_6+0x33>
 8048ddc:	8b 44 b4 0c          	mov    0xc(%esp,%esi,4),%eax
 8048de0:	83 e8 01             	sub    $0x1,%eax
 8048de3:	83 f8 05             	cmp    $0x5,%eax
 8048de6:	76 d8                	jbe    8048dc0 <phase_6+0x29>
 8048de8:	e8 cf 02 00 00       	call   80490bc <explode_bomb>
 8048ded:	eb d1                	jmp    8048dc0 <phase_6+0x29>
 8048def:	e8 c8 02 00 00       	call   80490bc <explode_bomb>
 8048df4:	eb de                	jmp    8048dd4 <phase_6+0x3d>
 8048df6:	bb 00 00 00 00       	mov    $0x0,%ebx
 8048dfb:	89 de                	mov    %ebx,%esi
 8048dfd:	8b 4c 9c 0c          	mov    0xc(%esp,%ebx,4),%ecx
 8048e01:	b8 01 00 00 00       	mov    $0x1,%eax
 8048e06:	ba 3c c1 04 08       	mov    $0x804c13c,%edx
 8048e0b:	83 f9 01             	cmp    $0x1,%ecx
 8048e0e:	7e 0a                	jle    8048e1a <phase_6+0x83>
 8048e10:	8b 52 08             	mov    0x8(%edx),%edx
 8048e13:	83 c0 01             	add    $0x1,%eax
 8048e16:	39 c8                	cmp    %ecx,%eax
 8048e18:	75 f6                	jne    8048e10 <phase_6+0x79>
 8048e1a:	89 54 b4 24          	mov    %edx,0x24(%esp,%esi,4)
 8048e1e:	83 c3 01             	add    $0x1,%ebx
 8048e21:	83 fb 06             	cmp    $0x6,%ebx
 8048e24:	75 d5                	jne    8048dfb <phase_6+0x64>
 8048e26:	8b 5c 24 24          	mov    0x24(%esp),%ebx
 8048e2a:	89 d9                	mov    %ebx,%ecx
 8048e2c:	b8 01 00 00 00       	mov    $0x1,%eax
 8048e31:	8b 54 84 24          	mov    0x24(%esp,%eax,4),%edx
 8048e35:	89 51 08             	mov    %edx,0x8(%ecx)
 8048e38:	83 c0 01             	add    $0x1,%eax
 8048e3b:	89 d1                	mov    %edx,%ecx
 8048e3d:	83 f8 06             	cmp    $0x6,%eax
 8048e40:	75 ef                	jne    8048e31 <phase_6+0x9a>
 8048e42:	c7 42 08 00 00 00 00 	movl   $0x0,0x8(%edx)
 8048e49:	be 05 00 00 00       	mov    $0x5,%esi
 8048e4e:	eb 08                	jmp    8048e58 <phase_6+0xc1>
 8048e50:	8b 5b 08             	mov    0x8(%ebx),%ebx
 8048e53:	83 ee 01             	sub    $0x1,%esi
 8048e56:	74 10                	je     8048e68 <phase_6+0xd1>
 8048e58:	8b 43 08             	mov    0x8(%ebx),%eax
 8048e5b:	8b 00                	mov    (%eax),%eax
 8048e5d:	39 03                	cmp    %eax,(%ebx)
 8048e5f:	7e ef                	jle    8048e50 <phase_6+0xb9>
 8048e61:	e8 56 02 00 00       	call   80490bc <explode_bomb>
 8048e66:	eb e8                	jmp    8048e50 <phase_6+0xb9>
 8048e68:	8b 44 24 3c          	mov    0x3c(%esp),%eax
 8048e6c:	65 33 05 14 00 00 00 	xor    %gs:0x14,%eax
 8048e73:	75 06                	jne    8048e7b <phase_6+0xe4>
 8048e75:	83 c4 44             	add    $0x44,%esp
 8048e78:	5b                   	pop    %ebx
 8048e79:	5e                   	pop    %esi
 8048e7a:	c3                   	ret    
 8048e7b:	e8 10 f9 ff ff       	call   8048790 <__stack_chk_fail@plt>

08048e80 <fun7>:
 8048e80:	53                   	push   %ebx
 8048e81:	83 ec 08             	sub    $0x8,%esp
 8048e84:	8b 54 24 10          	mov    0x10(%esp),%edx
 8048e88:	8b 4c 24 14          	mov    0x14(%esp),%ecx
 8048e8c:	85 d2                	test   %edx,%edx
 8048e8e:	74 3a                	je     8048eca <fun7+0x4a>
 8048e90:	8b 1a                	mov    (%edx),%ebx
 8048e92:	39 cb                	cmp    %ecx,%ebx
 8048e94:	7f 21                	jg     8048eb7 <fun7+0x37>
 8048e96:	b8 00 00 00 00       	mov    $0x0,%eax
 8048e9b:	39 cb                	cmp    %ecx,%ebx
 8048e9d:	74 13                	je     8048eb2 <fun7+0x32>
 8048e9f:	83 ec 08             	sub    $0x8,%esp
 8048ea2:	51                   	push   %ecx
 8048ea3:	ff 72 08             	pushl  0x8(%edx)
 8048ea6:	e8 d5 ff ff ff       	call   8048e80 <fun7>
 8048eab:	83 c4 10             	add    $0x10,%esp
 8048eae:	8d 44 00 01          	lea    0x1(%eax,%eax,1),%eax
 8048eb2:	83 c4 08             	add    $0x8,%esp
 8048eb5:	5b                   	pop    %ebx
 8048eb6:	c3                   	ret    
 8048eb7:	83 ec 08             	sub    $0x8,%esp
 8048eba:	51                   	push   %ecx
 8048ebb:	ff 72 04             	pushl  0x4(%edx)
 8048ebe:	e8 bd ff ff ff       	call   8048e80 <fun7>
 8048ec3:	83 c4 10             	add    $0x10,%esp
 8048ec6:	01 c0                	add    %eax,%eax
 8048ec8:	eb e8                	jmp    8048eb2 <fun7+0x32>
 8048eca:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
 8048ecf:	eb e1                	jmp    8048eb2 <fun7+0x32>

08048ed1 <secret_phase>:
 8048ed1:	53                   	push   %ebx
 8048ed2:	83 ec 08             	sub    $0x8,%esp
 8048ed5:	e8 42 02 00 00       	call   804911c <read_line>
 8048eda:	83 ec 04             	sub    $0x4,%esp
 8048edd:	6a 0a                	push   $0xa
 8048edf:	6a 00                	push   $0x0
 8048ee1:	50                   	push   %eax
 8048ee2:	e8 99 f9 ff ff       	call   8048880 <strtol@plt>
 8048ee7:	89 c3                	mov    %eax,%ebx
 8048ee9:	8d 40 ff             	lea    -0x1(%eax),%eax
 8048eec:	83 c4 10             	add    $0x10,%esp
 8048eef:	3d e8 03 00 00       	cmp    $0x3e8,%eax
 8048ef4:	77 32                	ja     8048f28 <secret_phase+0x57>
 8048ef6:	83 ec 08             	sub    $0x8,%esp
 8048ef9:	53                   	push   %ebx
 8048efa:	68 88 c0 04 08       	push   $0x804c088
 8048eff:	e8 7c ff ff ff       	call   8048e80 <fun7>
 8048f04:	83 c4 10             	add    $0x10,%esp
 8048f07:	83 f8 02             	cmp    $0x2,%eax
 8048f0a:	74 05                	je     8048f11 <secret_phase+0x40>
 8048f0c:	e8 ab 01 00 00       	call   80490bc <explode_bomb>
 8048f11:	83 ec 0c             	sub    $0xc,%esp
 8048f14:	68 f4 9f 04 08       	push   $0x8049ff4
 8048f19:	e8 a2 f8 ff ff       	call   80487c0 <puts@plt>
 8048f1e:	e8 f8 02 00 00       	call   804921b <phase_defused>
 8048f23:	83 c4 18             	add    $0x18,%esp
 8048f26:	5b                   	pop    %ebx
 8048f27:	c3                   	ret    
 8048f28:	e8 8f 01 00 00       	call   80490bc <explode_bomb>
 8048f2d:	eb c7                	jmp    8048ef6 <secret_phase+0x25>

08048f2f <sig_handler>:
 8048f2f:	83 ec 18             	sub    $0x18,%esp
 8048f32:	68 80 a0 04 08       	push   $0x804a080
 8048f37:	e8 84 f8 ff ff       	call   80487c0 <puts@plt>
 8048f3c:	c7 04 24 03 00 00 00 	movl   $0x3,(%esp)
 8048f43:	e8 28 f8 ff ff       	call   8048770 <sleep@plt>
 8048f48:	83 c4 08             	add    $0x8,%esp
 8048f4b:	68 42 a1 04 08       	push   $0x804a142
 8048f50:	6a 01                	push   $0x1
 8048f52:	e8 e9 f8 ff ff       	call   8048840 <__printf_chk@plt>
 8048f57:	83 c4 04             	add    $0x4,%esp
 8048f5a:	ff 35 c4 c3 04 08    	pushl  0x804c3c4
 8048f60:	e8 db f7 ff ff       	call   8048740 <fflush@plt>
 8048f65:	c7 04 24 01 00 00 00 	movl   $0x1,(%esp)
 8048f6c:	e8 ff f7 ff ff       	call   8048770 <sleep@plt>
 8048f71:	c7 04 24 4a a1 04 08 	movl   $0x804a14a,(%esp)
 8048f78:	e8 43 f8 ff ff       	call   80487c0 <puts@plt>
 8048f7d:	c7 04 24 10 00 00 00 	movl   $0x10,(%esp)
 8048f84:	e8 57 f8 ff ff       	call   80487e0 <exit@plt>

08048f89 <invalid_phase>:
 8048f89:	83 ec 10             	sub    $0x10,%esp
 8048f8c:	ff 74 24 14          	pushl  0x14(%esp)
 8048f90:	68 52 a1 04 08       	push   $0x804a152
 8048f95:	6a 01                	push   $0x1
 8048f97:	e8 a4 f8 ff ff       	call   8048840 <__printf_chk@plt>
 8048f9c:	c7 04 24 08 00 00 00 	movl   $0x8,(%esp)
 8048fa3:	e8 38 f8 ff ff       	call   80487e0 <exit@plt>

08048fa8 <string_length>:
 8048fa8:	8b 54 24 04          	mov    0x4(%esp),%edx
 8048fac:	80 3a 00             	cmpb   $0x0,(%edx)
 8048faf:	74 10                	je     8048fc1 <string_length+0x19>
 8048fb1:	b8 00 00 00 00       	mov    $0x0,%eax
 8048fb6:	83 c0 01             	add    $0x1,%eax
 8048fb9:	80 3c 02 00          	cmpb   $0x0,(%edx,%eax,1)
 8048fbd:	75 f7                	jne    8048fb6 <string_length+0xe>
 8048fbf:	f3 c3                	repz ret 
 8048fc1:	b8 00 00 00 00       	mov    $0x0,%eax
 8048fc6:	c3                   	ret    

08048fc7 <strings_not_equal>:
 8048fc7:	57                   	push   %edi
 8048fc8:	56                   	push   %esi
 8048fc9:	53                   	push   %ebx
 8048fca:	8b 5c 24 10          	mov    0x10(%esp),%ebx
 8048fce:	8b 74 24 14          	mov    0x14(%esp),%esi
 8048fd2:	53                   	push   %ebx
 8048fd3:	e8 d0 ff ff ff       	call   8048fa8 <string_length>
 8048fd8:	89 c7                	mov    %eax,%edi
 8048fda:	89 34 24             	mov    %esi,(%esp)
 8048fdd:	e8 c6 ff ff ff       	call   8048fa8 <string_length>
 8048fe2:	83 c4 04             	add    $0x4,%esp
 8048fe5:	ba 01 00 00 00       	mov    $0x1,%edx
 8048fea:	39 c7                	cmp    %eax,%edi
 8048fec:	74 06                	je     8048ff4 <strings_not_equal+0x2d>
 8048fee:	89 d0                	mov    %edx,%eax
 8048ff0:	5b                   	pop    %ebx
 8048ff1:	5e                   	pop    %esi
 8048ff2:	5f                   	pop    %edi
 8048ff3:	c3                   	ret    
 8048ff4:	0f b6 03             	movzbl (%ebx),%eax
 8048ff7:	84 c0                	test   %al,%al
 8048ff9:	74 23                	je     804901e <strings_not_equal+0x57>
 8048ffb:	3a 06                	cmp    (%esi),%al
 8048ffd:	75 26                	jne    8049025 <strings_not_equal+0x5e>
 8048fff:	83 c3 01             	add    $0x1,%ebx
 8049002:	83 c6 01             	add    $0x1,%esi
 8049005:	0f b6 03             	movzbl (%ebx),%eax
 8049008:	84 c0                	test   %al,%al
 804900a:	74 0b                	je     8049017 <strings_not_equal+0x50>
 804900c:	3a 06                	cmp    (%esi),%al
 804900e:	74 ef                	je     8048fff <strings_not_equal+0x38>
 8049010:	ba 01 00 00 00       	mov    $0x1,%edx
 8049015:	eb d7                	jmp    8048fee <strings_not_equal+0x27>
 8049017:	ba 00 00 00 00       	mov    $0x0,%edx
 804901c:	eb d0                	jmp    8048fee <strings_not_equal+0x27>
 804901e:	ba 00 00 00 00       	mov    $0x0,%edx
 8049023:	eb c9                	jmp    8048fee <strings_not_equal+0x27>
 8049025:	ba 01 00 00 00       	mov    $0x1,%edx
 804902a:	eb c2                	jmp    8048fee <strings_not_equal+0x27>

0804902c <initialize_bomb>:
 804902c:	83 ec 14             	sub    $0x14,%esp
 804902f:	68 2f 8f 04 08       	push   $0x8048f2f
 8049034:	6a 02                	push   $0x2
 8049036:	e8 25 f7 ff ff       	call   8048760 <signal@plt>
 804903b:	83 c4 1c             	add    $0x1c,%esp
 804903e:	c3                   	ret    

0804903f <initialize_bomb_solve>:
 804903f:	f3 c3                	repz ret 

08049041 <blank_line>:
 8049041:	56                   	push   %esi
 8049042:	53                   	push   %ebx
 8049043:	83 ec 04             	sub    $0x4,%esp
 8049046:	8b 74 24 10          	mov    0x10(%esp),%esi
 804904a:	0f b6 1e             	movzbl (%esi),%ebx
 804904d:	84 db                	test   %bl,%bl
 804904f:	74 1b                	je     804906c <blank_line+0x2b>
 8049051:	e8 5a f8 ff ff       	call   80488b0 <__ctype_b_loc@plt>
 8049056:	83 c6 01             	add    $0x1,%esi
 8049059:	0f be db             	movsbl %bl,%ebx
 804905c:	8b 00                	mov    (%eax),%eax
 804905e:	f6 44 58 01 20       	testb  $0x20,0x1(%eax,%ebx,2)
 8049063:	75 e5                	jne    804904a <blank_line+0x9>
 8049065:	b8 00 00 00 00       	mov    $0x0,%eax
 804906a:	eb 05                	jmp    8049071 <blank_line+0x30>
 804906c:	b8 01 00 00 00       	mov    $0x1,%eax
 8049071:	83 c4 04             	add    $0x4,%esp
 8049074:	5b                   	pop    %ebx
 8049075:	5e                   	pop    %esi
 8049076:	c3                   	ret    

08049077 <skip>:
 8049077:	53                   	push   %ebx
 8049078:	83 ec 08             	sub    $0x8,%esp
 804907b:	83 ec 04             	sub    $0x4,%esp
 804907e:	ff 35 d0 c3 04 08    	pushl  0x804c3d0
 8049084:	6a 50                	push   $0x50
 8049086:	a1 cc c3 04 08       	mov    0x804c3cc,%eax
 804908b:	8d 04 80             	lea    (%eax,%eax,4),%eax
 804908e:	c1 e0 04             	shl    $0x4,%eax
 8049091:	05 e0 c3 04 08       	add    $0x804c3e0,%eax
 8049096:	50                   	push   %eax
 8049097:	e8 b4 f6 ff ff       	call   8048750 <fgets@plt>
 804909c:	89 c3                	mov    %eax,%ebx
 804909e:	83 c4 10             	add    $0x10,%esp
 80490a1:	85 c0                	test   %eax,%eax
 80490a3:	74 10                	je     80490b5 <skip+0x3e>
 80490a5:	83 ec 0c             	sub    $0xc,%esp
 80490a8:	50                   	push   %eax
 80490a9:	e8 93 ff ff ff       	call   8049041 <blank_line>
 80490ae:	83 c4 10             	add    $0x10,%esp
 80490b1:	85 c0                	test   %eax,%eax
 80490b3:	75 c6                	jne    804907b <skip+0x4>
 80490b5:	89 d8                	mov    %ebx,%eax
 80490b7:	83 c4 08             	add    $0x8,%esp
 80490ba:	5b                   	pop    %ebx
 80490bb:	c3                   	ret    

080490bc <explode_bomb>:
 80490bc:	83 ec 18             	sub    $0x18,%esp
 80490bf:	68 63 a1 04 08       	push   $0x804a163
 80490c4:	e8 f7 f6 ff ff       	call   80487c0 <puts@plt>
 80490c9:	c7 04 24 6c a1 04 08 	movl   $0x804a16c,(%esp)
 80490d0:	e8 eb f6 ff ff       	call   80487c0 <puts@plt>
 80490d5:	c7 04 24 08 00 00 00 	movl   $0x8,(%esp)
 80490dc:	e8 ff f6 ff ff       	call   80487e0 <exit@plt>

080490e1 <read_six_numbers>:
 80490e1:	83 ec 0c             	sub    $0xc,%esp
 80490e4:	8b 44 24 14          	mov    0x14(%esp),%eax
 80490e8:	8d 50 14             	lea    0x14(%eax),%edx
 80490eb:	52                   	push   %edx
 80490ec:	8d 50 10             	lea    0x10(%eax),%edx
 80490ef:	52                   	push   %edx
 80490f0:	8d 50 0c             	lea    0xc(%eax),%edx
 80490f3:	52                   	push   %edx
 80490f4:	8d 50 08             	lea    0x8(%eax),%edx
 80490f7:	52                   	push   %edx
 80490f8:	8d 50 04             	lea    0x4(%eax),%edx
 80490fb:	52                   	push   %edx
 80490fc:	50                   	push   %eax
 80490fd:	68 83 a1 04 08       	push   $0x804a183
 8049102:	ff 74 24 2c          	pushl  0x2c(%esp)
 8049106:	e8 05 f7 ff ff       	call   8048810 <__isoc99_sscanf@plt>
 804910b:	83 c4 20             	add    $0x20,%esp
 804910e:	83 f8 05             	cmp    $0x5,%eax
 8049111:	7e 04                	jle    8049117 <read_six_numbers+0x36>
 8049113:	83 c4 0c             	add    $0xc,%esp
 8049116:	c3                   	ret    
 8049117:	e8 a0 ff ff ff       	call   80490bc <explode_bomb>

0804911c <read_line>:
 804911c:	57                   	push   %edi
 804911d:	56                   	push   %esi
 804911e:	53                   	push   %ebx
 804911f:	e8 53 ff ff ff       	call   8049077 <skip>
 8049124:	85 c0                	test   %eax,%eax
 8049126:	74 4b                	je     8049173 <read_line+0x57>
 8049128:	8b 15 cc c3 04 08    	mov    0x804c3cc,%edx
 804912e:	8d 1c 92             	lea    (%edx,%edx,4),%ebx
 8049131:	c1 e3 04             	shl    $0x4,%ebx
 8049134:	81 c3 e0 c3 04 08    	add    $0x804c3e0,%ebx
 804913a:	b8 00 00 00 00       	mov    $0x0,%eax
 804913f:	b9 ff ff ff ff       	mov    $0xffffffff,%ecx
 8049144:	89 df                	mov    %ebx,%edi
 8049146:	f2 ae                	repnz scas %es:(%edi),%al
 8049148:	f7 d1                	not    %ecx
 804914a:	83 e9 01             	sub    $0x1,%ecx
 804914d:	83 f9 4e             	cmp    $0x4e,%ecx
 8049150:	0f 8f 8d 00 00 00    	jg     80491e3 <read_line+0xc7>
 8049156:	8d 04 92             	lea    (%edx,%edx,4),%eax
 8049159:	c1 e0 04             	shl    $0x4,%eax
 804915c:	c6 84 01 df c3 04 08 	movb   $0x0,0x804c3df(%ecx,%eax,1)
 8049163:	00 
 8049164:	83 c2 01             	add    $0x1,%edx
 8049167:	89 15 cc c3 04 08    	mov    %edx,0x804c3cc
 804916d:	89 d8                	mov    %ebx,%eax
 804916f:	5b                   	pop    %ebx
 8049170:	5e                   	pop    %esi
 8049171:	5f                   	pop    %edi
 8049172:	c3                   	ret    
 8049173:	a1 c0 c3 04 08       	mov    0x804c3c0,%eax
 8049178:	39 05 d0 c3 04 08    	cmp    %eax,0x804c3d0
 804917e:	74 40                	je     80491c0 <read_line+0xa4>
 8049180:	83 ec 0c             	sub    $0xc,%esp
 8049183:	68 b3 a1 04 08       	push   $0x804a1b3
 8049188:	e8 23 f6 ff ff       	call   80487b0 <getenv@plt>
 804918d:	83 c4 10             	add    $0x10,%esp
 8049190:	85 c0                	test   %eax,%eax
 8049192:	75 45                	jne    80491d9 <read_line+0xbd>
 8049194:	a1 c0 c3 04 08       	mov    0x804c3c0,%eax
 8049199:	a3 d0 c3 04 08       	mov    %eax,0x804c3d0
 804919e:	e8 d4 fe ff ff       	call   8049077 <skip>
 80491a3:	85 c0                	test   %eax,%eax
 80491a5:	75 81                	jne    8049128 <read_line+0xc>
 80491a7:	83 ec 0c             	sub    $0xc,%esp
 80491aa:	68 95 a1 04 08       	push   $0x804a195
 80491af:	e8 0c f6 ff ff       	call   80487c0 <puts@plt>
 80491b4:	c7 04 24 00 00 00 00 	movl   $0x0,(%esp)
 80491bb:	e8 20 f6 ff ff       	call   80487e0 <exit@plt>
 80491c0:	83 ec 0c             	sub    $0xc,%esp
 80491c3:	68 95 a1 04 08       	push   $0x804a195
 80491c8:	e8 f3 f5 ff ff       	call   80487c0 <puts@plt>
 80491cd:	c7 04 24 08 00 00 00 	movl   $0x8,(%esp)
 80491d4:	e8 07 f6 ff ff       	call   80487e0 <exit@plt>
 80491d9:	83 ec 0c             	sub    $0xc,%esp
 80491dc:	6a 00                	push   $0x0
 80491de:	e8 fd f5 ff ff       	call   80487e0 <exit@plt>
 80491e3:	83 ec 0c             	sub    $0xc,%esp
 80491e6:	68 be a1 04 08       	push   $0x804a1be
 80491eb:	e8 d0 f5 ff ff       	call   80487c0 <puts@plt>
 80491f0:	a1 cc c3 04 08       	mov    0x804c3cc,%eax
 80491f5:	8d 50 01             	lea    0x1(%eax),%edx
 80491f8:	89 15 cc c3 04 08    	mov    %edx,0x804c3cc
 80491fe:	6b c0 50             	imul   $0x50,%eax,%eax
 8049201:	05 e0 c3 04 08       	add    $0x804c3e0,%eax
 8049206:	ba d9 a1 04 08       	mov    $0x804a1d9,%edx
 804920b:	b9 04 00 00 00       	mov    $0x4,%ecx
 8049210:	89 c7                	mov    %eax,%edi
 8049212:	89 d6                	mov    %edx,%esi
 8049214:	f3 a5                	rep movsl %ds:(%esi),%es:(%edi)
 8049216:	e8 a1 fe ff ff       	call   80490bc <explode_bomb>

0804921b <phase_defused>:
 804921b:	83 ec 6c             	sub    $0x6c,%esp
 804921e:	65 a1 14 00 00 00    	mov    %gs:0x14,%eax
 8049224:	89 44 24 5c          	mov    %eax,0x5c(%esp)
 8049228:	31 c0                	xor    %eax,%eax
 804922a:	83 3d cc c3 04 08 06 	cmpl   $0x6,0x804c3cc
 8049231:	74 11                	je     8049244 <phase_defused+0x29>
 8049233:	8b 44 24 5c          	mov    0x5c(%esp),%eax
 8049237:	65 33 05 14 00 00 00 	xor    %gs:0x14,%eax
 804923e:	75 7b                	jne    80492bb <phase_defused+0xa0>
 8049240:	83 c4 6c             	add    $0x6c,%esp
 8049243:	c3                   	ret    
 8049244:	83 ec 0c             	sub    $0xc,%esp
 8049247:	8d 44 24 18          	lea    0x18(%esp),%eax
 804924b:	50                   	push   %eax
 804924c:	8d 44 24 18          	lea    0x18(%esp),%eax
 8049250:	50                   	push   %eax
 8049251:	8d 44 24 18          	lea    0x18(%esp),%eax
 8049255:	50                   	push   %eax
 8049256:	68 e9 a1 04 08       	push   $0x804a1e9
 804925b:	68 d0 c4 04 08       	push   $0x804c4d0
 8049260:	e8 ab f5 ff ff       	call   8048810 <__isoc99_sscanf@plt>
 8049265:	83 c4 20             	add    $0x20,%esp
 8049268:	83 f8 03             	cmp    $0x3,%eax
 804926b:	74 12                	je     804927f <phase_defused+0x64>
 804926d:	83 ec 0c             	sub    $0xc,%esp
 8049270:	68 18 a1 04 08       	push   $0x804a118
 8049275:	e8 46 f5 ff ff       	call   80487c0 <puts@plt>
 804927a:	83 c4 10             	add    $0x10,%esp
 804927d:	eb b4                	jmp    8049233 <phase_defused+0x18>
 804927f:	83 ec 08             	sub    $0x8,%esp
 8049282:	68 f2 a1 04 08       	push   $0x804a1f2
 8049287:	8d 44 24 18          	lea    0x18(%esp),%eax
 804928b:	50                   	push   %eax
 804928c:	e8 36 fd ff ff       	call   8048fc7 <strings_not_equal>
 8049291:	83 c4 10             	add    $0x10,%esp
 8049294:	85 c0                	test   %eax,%eax
 8049296:	75 d5                	jne    804926d <phase_defused+0x52>
 8049298:	83 ec 0c             	sub    $0xc,%esp
 804929b:	68 b8 a0 04 08       	push   $0x804a0b8
 80492a0:	e8 1b f5 ff ff       	call   80487c0 <puts@plt>
 80492a5:	c7 04 24 e0 a0 04 08 	movl   $0x804a0e0,(%esp)
 80492ac:	e8 0f f5 ff ff       	call   80487c0 <puts@plt>
 80492b1:	e8 1b fc ff ff       	call   8048ed1 <secret_phase>
 80492b6:	83 c4 10             	add    $0x10,%esp
 80492b9:	eb b2                	jmp    804926d <phase_defused+0x52>
 80492bb:	e8 d0 f4 ff ff       	call   8048790 <__stack_chk_fail@plt>

080492c0 <sigalrm_handler>:
 80492c0:	83 ec 0c             	sub    $0xc,%esp
 80492c3:	6a 00                	push   $0x0
 80492c5:	68 48 a2 04 08       	push   $0x804a248
 80492ca:	6a 01                	push   $0x1
 80492cc:	ff 35 a0 c3 04 08    	pushl  0x804c3a0
 80492d2:	e8 89 f5 ff ff       	call   8048860 <__fprintf_chk@plt>
 80492d7:	c7 04 24 01 00 00 00 	movl   $0x1,(%esp)
 80492de:	e8 fd f4 ff ff       	call   80487e0 <exit@plt>

080492e3 <rio_readlineb>:
 80492e3:	55                   	push   %ebp
 80492e4:	57                   	push   %edi
 80492e5:	56                   	push   %esi
 80492e6:	53                   	push   %ebx
 80492e7:	83 ec 1c             	sub    $0x1c,%esp
 80492ea:	83 f9 01             	cmp    $0x1,%ecx
 80492ed:	76 79                	jbe    8049368 <rio_readlineb+0x85>
 80492ef:	89 d7                	mov    %edx,%edi
 80492f1:	89 c3                	mov    %eax,%ebx
 80492f3:	89 4c 24 0c          	mov    %ecx,0xc(%esp)
 80492f7:	bd 01 00 00 00       	mov    $0x1,%ebp
 80492fc:	8d 70 0c             	lea    0xc(%eax),%esi
 80492ff:	eb 0a                	jmp    804930b <rio_readlineb+0x28>
 8049301:	e8 2a f5 ff ff       	call   8048830 <__errno_location@plt>
 8049306:	83 38 04             	cmpl   $0x4,(%eax)
 8049309:	75 66                	jne    8049371 <rio_readlineb+0x8e>
 804930b:	8b 43 04             	mov    0x4(%ebx),%eax
 804930e:	85 c0                	test   %eax,%eax
 8049310:	7f 23                	jg     8049335 <rio_readlineb+0x52>
 8049312:	83 ec 04             	sub    $0x4,%esp
 8049315:	68 00 20 00 00       	push   $0x2000
 804931a:	56                   	push   %esi
 804931b:	ff 33                	pushl  (%ebx)
 804931d:	e8 0e f4 ff ff       	call   8048730 <read@plt>
 8049322:	89 43 04             	mov    %eax,0x4(%ebx)
 8049325:	83 c4 10             	add    $0x10,%esp
 8049328:	85 c0                	test   %eax,%eax
 804932a:	78 d5                	js     8049301 <rio_readlineb+0x1e>
 804932c:	85 c0                	test   %eax,%eax
 804932e:	74 48                	je     8049378 <rio_readlineb+0x95>
 8049330:	89 73 08             	mov    %esi,0x8(%ebx)
 8049333:	eb d6                	jmp    804930b <rio_readlineb+0x28>
 8049335:	8b 4b 08             	mov    0x8(%ebx),%ecx
 8049338:	0f b6 11             	movzbl (%ecx),%edx
 804933b:	83 c1 01             	add    $0x1,%ecx
 804933e:	89 4b 08             	mov    %ecx,0x8(%ebx)
 8049341:	83 e8 01             	sub    $0x1,%eax
 8049344:	89 43 04             	mov    %eax,0x4(%ebx)
 8049347:	83 c7 01             	add    $0x1,%edi
 804934a:	88 57 ff             	mov    %dl,-0x1(%edi)
 804934d:	80 fa 0a             	cmp    $0xa,%dl
 8049350:	74 09                	je     804935b <rio_readlineb+0x78>
 8049352:	83 c5 01             	add    $0x1,%ebp
 8049355:	3b 6c 24 0c          	cmp    0xc(%esp),%ebp
 8049359:	75 b0                	jne    804930b <rio_readlineb+0x28>
 804935b:	c6 07 00             	movb   $0x0,(%edi)
 804935e:	89 e8                	mov    %ebp,%eax
 8049360:	83 c4 1c             	add    $0x1c,%esp
 8049363:	5b                   	pop    %ebx
 8049364:	5e                   	pop    %esi
 8049365:	5f                   	pop    %edi
 8049366:	5d                   	pop    %ebp
 8049367:	c3                   	ret    
 8049368:	89 d7                	mov    %edx,%edi
 804936a:	bd 01 00 00 00       	mov    $0x1,%ebp
 804936f:	eb ea                	jmp    804935b <rio_readlineb+0x78>
 8049371:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
 8049376:	eb 05                	jmp    804937d <rio_readlineb+0x9a>
 8049378:	b8 00 00 00 00       	mov    $0x0,%eax
 804937d:	85 c0                	test   %eax,%eax
 804937f:	75 0c                	jne    804938d <rio_readlineb+0xaa>
 8049381:	83 fd 01             	cmp    $0x1,%ebp
 8049384:	75 d5                	jne    804935b <rio_readlineb+0x78>
 8049386:	bd 00 00 00 00       	mov    $0x0,%ebp
 804938b:	eb d1                	jmp    804935e <rio_readlineb+0x7b>
 804938d:	bd ff ff ff ff       	mov    $0xffffffff,%ebp
 8049392:	eb ca                	jmp    804935e <rio_readlineb+0x7b>

08049394 <submitr>:
 8049394:	55                   	push   %ebp
 8049395:	57                   	push   %edi
 8049396:	56                   	push   %esi
 8049397:	53                   	push   %ebx
 8049398:	81 ec 60 a0 00 00    	sub    $0xa060,%esp
 804939e:	8b 9c 24 74 a0 00 00 	mov    0xa074(%esp),%ebx
 80493a5:	8b 84 24 7c a0 00 00 	mov    0xa07c(%esp),%eax
 80493ac:	89 44 24 0c          	mov    %eax,0xc(%esp)
 80493b0:	8b 84 24 80 a0 00 00 	mov    0xa080(%esp),%eax
 80493b7:	89 44 24 10          	mov    %eax,0x10(%esp)
 80493bb:	8b 84 24 84 a0 00 00 	mov    0xa084(%esp),%eax
 80493c2:	89 44 24 14          	mov    %eax,0x14(%esp)
 80493c6:	8b b4 24 88 a0 00 00 	mov    0xa088(%esp),%esi
 80493cd:	8b 84 24 8c a0 00 00 	mov    0xa08c(%esp),%eax
 80493d4:	89 44 24 18          	mov    %eax,0x18(%esp)
 80493d8:	65 a1 14 00 00 00    	mov    %gs:0x14,%eax
 80493de:	89 84 24 50 a0 00 00 	mov    %eax,0xa050(%esp)
 80493e5:	31 c0                	xor    %eax,%eax
 80493e7:	c7 44 24 30 00 00 00 	movl   $0x0,0x30(%esp)
 80493ee:	00 
 80493ef:	6a 00                	push   $0x0
 80493f1:	6a 01                	push   $0x1
 80493f3:	6a 02                	push   $0x2
 80493f5:	e8 56 f4 ff ff       	call   8048850 <socket@plt>
 80493fa:	83 c4 10             	add    $0x10,%esp
 80493fd:	85 c0                	test   %eax,%eax
 80493ff:	0f 88 04 01 00 00    	js     8049509 <submitr+0x175>
 8049405:	89 c5                	mov    %eax,%ebp
 8049407:	83 ec 0c             	sub    $0xc,%esp
 804940a:	53                   	push   %ebx
 804940b:	e8 60 f4 ff ff       	call   8048870 <gethostbyname@plt>
 8049410:	83 c4 10             	add    $0x10,%esp
 8049413:	85 c0                	test   %eax,%eax
 8049415:	0f 84 40 01 00 00    	je     804955b <submitr+0x1c7>
 804941b:	8d 5c 24 30          	lea    0x30(%esp),%ebx
 804941f:	c7 44 24 30 00 00 00 	movl   $0x0,0x30(%esp)
 8049426:	00 
 8049427:	c7 44 24 34 00 00 00 	movl   $0x0,0x34(%esp)
 804942e:	00 
 804942f:	c7 44 24 38 00 00 00 	movl   $0x0,0x38(%esp)
 8049436:	00 
 8049437:	c7 44 24 3c 00 00 00 	movl   $0x0,0x3c(%esp)
 804943e:	00 
 804943f:	66 c7 44 24 30 02 00 	movw   $0x2,0x30(%esp)
 8049446:	6a 0c                	push   $0xc
 8049448:	ff 70 0c             	pushl  0xc(%eax)
 804944b:	8b 40 10             	mov    0x10(%eax),%eax
 804944e:	ff 30                	pushl  (%eax)
 8049450:	8d 44 24 40          	lea    0x40(%esp),%eax
 8049454:	50                   	push   %eax
 8049455:	e8 76 f3 ff ff       	call   80487d0 <__memmove_chk@plt>
 804945a:	0f b7 84 24 84 a0 00 	movzwl 0xa084(%esp),%eax
 8049461:	00 
 8049462:	66 c1 c8 08          	ror    $0x8,%ax
 8049466:	66 89 44 24 42       	mov    %ax,0x42(%esp)
 804946b:	83 c4 0c             	add    $0xc,%esp
 804946e:	6a 10                	push   $0x10
 8049470:	53                   	push   %ebx
 8049471:	55                   	push   %ebp
 8049472:	e8 19 f4 ff ff       	call   8048890 <connect@plt>
 8049477:	83 c4 10             	add    $0x10,%esp
 804947a:	85 c0                	test   %eax,%eax
 804947c:	0f 88 49 01 00 00    	js     80495cb <submitr+0x237>
 8049482:	ba ff ff ff ff       	mov    $0xffffffff,%edx
 8049487:	b8 00 00 00 00       	mov    $0x0,%eax
 804948c:	89 d1                	mov    %edx,%ecx
 804948e:	89 f7                	mov    %esi,%edi
 8049490:	f2 ae                	repnz scas %es:(%edi),%al
 8049492:	89 cb                	mov    %ecx,%ebx
 8049494:	f7 d3                	not    %ebx
 8049496:	89 d1                	mov    %edx,%ecx
 8049498:	8b 7c 24 08          	mov    0x8(%esp),%edi
 804949c:	f2 ae                	repnz scas %es:(%edi),%al
 804949e:	89 4c 24 18          	mov    %ecx,0x18(%esp)
 80494a2:	89 d1                	mov    %edx,%ecx
 80494a4:	8b 7c 24 0c          	mov    0xc(%esp),%edi
 80494a8:	f2 ae                	repnz scas %es:(%edi),%al
 80494aa:	89 cf                	mov    %ecx,%edi
 80494ac:	f7 d7                	not    %edi
 80494ae:	89 7c 24 1c          	mov    %edi,0x1c(%esp)
 80494b2:	89 d1                	mov    %edx,%ecx
 80494b4:	8b 7c 24 10          	mov    0x10(%esp),%edi
 80494b8:	f2 ae                	repnz scas %es:(%edi),%al
 80494ba:	8b 54 24 1c          	mov    0x1c(%esp),%edx
 80494be:	2b 54 24 18          	sub    0x18(%esp),%edx
 80494c2:	29 ca                	sub    %ecx,%edx
 80494c4:	8d 44 5b fd          	lea    -0x3(%ebx,%ebx,2),%eax
 80494c8:	8d 44 02 7b          	lea    0x7b(%edx,%eax,1),%eax
 80494cc:	3d 00 20 00 00       	cmp    $0x2000,%eax
 80494d1:	0f 87 56 01 00 00    	ja     804962d <submitr+0x299>
 80494d7:	8d 94 24 4c 40 00 00 	lea    0x404c(%esp),%edx
 80494de:	b9 00 08 00 00       	mov    $0x800,%ecx
 80494e3:	b8 00 00 00 00       	mov    $0x0,%eax
 80494e8:	89 d7                	mov    %edx,%edi
 80494ea:	f3 ab                	rep stos %eax,%es:(%edi)
 80494ec:	b9 ff ff ff ff       	mov    $0xffffffff,%ecx
 80494f1:	89 f7                	mov    %esi,%edi
 80494f3:	f2 ae                	repnz scas %es:(%edi),%al
 80494f5:	f7 d1                	not    %ecx
 80494f7:	89 cb                	mov    %ecx,%ebx
 80494f9:	83 eb 01             	sub    $0x1,%ebx
 80494fc:	0f 84 07 06 00 00    	je     8049b09 <submitr+0x775>
 8049502:	89 d7                	mov    %edx,%edi
 8049504:	e9 b0 01 00 00       	jmp    80496b9 <submitr+0x325>
 8049509:	8b 44 24 14          	mov    0x14(%esp),%eax
 804950d:	c7 00 45 72 72 6f    	movl   $0x6f727245,(%eax)
 8049513:	c7 40 04 72 3a 20 43 	movl   $0x43203a72,0x4(%eax)
 804951a:	c7 40 08 6c 69 65 6e 	movl   $0x6e65696c,0x8(%eax)
 8049521:	c7 40 0c 74 20 75 6e 	movl   $0x6e752074,0xc(%eax)
 8049528:	c7 40 10 61 62 6c 65 	movl   $0x656c6261,0x10(%eax)
 804952f:	c7 40 14 20 74 6f 20 	movl   $0x206f7420,0x14(%eax)
 8049536:	c7 40 18 63 72 65 61 	movl   $0x61657263,0x18(%eax)
 804953d:	c7 40 1c 74 65 20 73 	movl   $0x73206574,0x1c(%eax)
 8049544:	c7 40 20 6f 63 6b 65 	movl   $0x656b636f,0x20(%eax)
 804954b:	66 c7 40 24 74 00    	movw   $0x74,0x24(%eax)
 8049551:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
 8049556:	e9 d0 04 00 00       	jmp    8049a2b <submitr+0x697>
 804955b:	8b 44 24 14          	mov    0x14(%esp),%eax
 804955f:	c7 00 45 72 72 6f    	movl   $0x6f727245,(%eax)
 8049565:	c7 40 04 72 3a 20 44 	movl   $0x44203a72,0x4(%eax)
 804956c:	c7 40 08 4e 53 20 69 	movl   $0x6920534e,0x8(%eax)
 8049573:	c7 40 0c 73 20 75 6e 	movl   $0x6e752073,0xc(%eax)
 804957a:	c7 40 10 61 62 6c 65 	movl   $0x656c6261,0x10(%eax)
 8049581:	c7 40 14 20 74 6f 20 	movl   $0x206f7420,0x14(%eax)
 8049588:	c7 40 18 72 65 73 6f 	movl   $0x6f736572,0x18(%eax)
 804958f:	c7 40 1c 6c 76 65 20 	movl   $0x2065766c,0x1c(%eax)
 8049596:	c7 40 20 73 65 72 76 	movl   $0x76726573,0x20(%eax)
 804959d:	c7 40 24 65 72 20 61 	movl   $0x61207265,0x24(%eax)
 80495a4:	c7 40 28 64 64 72 65 	movl   $0x65726464,0x28(%eax)
 80495ab:	66 c7 40 2c 73 73    	movw   $0x7373,0x2c(%eax)
 80495b1:	c6 40 2e 00          	movb   $0x0,0x2e(%eax)
 80495b5:	83 ec 0c             	sub    $0xc,%esp
 80495b8:	55                   	push   %ebp
 80495b9:	e8 e2 f2 ff ff       	call   80488a0 <close@plt>
 80495be:	83 c4 10             	add    $0x10,%esp
 80495c1:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
 80495c6:	e9 60 04 00 00       	jmp    8049a2b <submitr+0x697>
 80495cb:	8b 44 24 14          	mov    0x14(%esp),%eax
 80495cf:	c7 00 45 72 72 6f    	movl   $0x6f727245,(%eax)
 80495d5:	c7 40 04 72 3a 20 55 	movl   $0x55203a72,0x4(%eax)
 80495dc:	c7 40 08 6e 61 62 6c 	movl   $0x6c62616e,0x8(%eax)
 80495e3:	c7 40 0c 65 20 74 6f 	movl   $0x6f742065,0xc(%eax)
 80495ea:	c7 40 10 20 63 6f 6e 	movl   $0x6e6f6320,0x10(%eax)
 80495f1:	c7 40 14 6e 65 63 74 	movl   $0x7463656e,0x14(%eax)
 80495f8:	c7 40 18 20 74 6f 20 	movl   $0x206f7420,0x18(%eax)
 80495ff:	c7 40 1c 74 68 65 20 	movl   $0x20656874,0x1c(%eax)
 8049606:	c7 40 20 73 65 72 76 	movl   $0x76726573,0x20(%eax)
 804960d:	66 c7 40 24 65 72    	movw   $0x7265,0x24(%eax)
 8049613:	c6 40 26 00          	movb   $0x0,0x26(%eax)
 8049617:	83 ec 0c             	sub    $0xc,%esp
 804961a:	55                   	push   %ebp
 804961b:	e8 80 f2 ff ff       	call   80488a0 <close@plt>
 8049620:	83 c4 10             	add    $0x10,%esp
 8049623:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
 8049628:	e9 fe 03 00 00       	jmp    8049a2b <submitr+0x697>
 804962d:	8b 44 24 14          	mov    0x14(%esp),%eax
 8049631:	c7 00 45 72 72 6f    	movl   $0x6f727245,(%eax)
 8049637:	c7 40 04 72 3a 20 52 	movl   $0x52203a72,0x4(%eax)
 804963e:	c7 40 08 65 73 75 6c 	movl   $0x6c757365,0x8(%eax)
 8049645:	c7 40 0c 74 20 73 74 	movl   $0x74732074,0xc(%eax)
 804964c:	c7 40 10 72 69 6e 67 	movl   $0x676e6972,0x10(%eax)
 8049653:	c7 40 14 20 74 6f 6f 	movl   $0x6f6f7420,0x14(%eax)
 804965a:	c7 40 18 20 6c 61 72 	movl   $0x72616c20,0x18(%eax)
 8049661:	c7 40 1c 67 65 2e 20 	movl   $0x202e6567,0x1c(%eax)
 8049668:	c7 40 20 49 6e 63 72 	movl   $0x72636e49,0x20(%eax)
 804966f:	c7 40 24 65 61 73 65 	movl   $0x65736165,0x24(%eax)
 8049676:	c7 40 28 20 53 55 42 	movl   $0x42555320,0x28(%eax)
 804967d:	c7 40 2c 4d 49 54 52 	movl   $0x5254494d,0x2c(%eax)
 8049684:	c7 40 30 5f 4d 41 58 	movl   $0x58414d5f,0x30(%eax)
 804968b:	c7 40 34 42 55 46 00 	movl   $0x465542,0x34(%eax)
 8049692:	83 ec 0c             	sub    $0xc,%esp
 8049695:	55                   	push   %ebp
 8049696:	e8 05 f2 ff ff       	call   80488a0 <close@plt>
 804969b:	83 c4 10             	add    $0x10,%esp
 804969e:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
 80496a3:	e9 83 03 00 00       	jmp    8049a2b <submitr+0x697>
 80496a8:	88 17                	mov    %dl,(%edi)
 80496aa:	8d 7f 01             	lea    0x1(%edi),%edi
 80496ad:	83 c6 01             	add    $0x1,%esi
 80496b0:	83 eb 01             	sub    $0x1,%ebx
 80496b3:	0f 84 50 04 00 00    	je     8049b09 <submitr+0x775>
 80496b9:	0f b6 16             	movzbl (%esi),%edx
 80496bc:	8d 4a d6             	lea    -0x2a(%edx),%ecx
 80496bf:	b8 01 00 00 00       	mov    $0x1,%eax
 80496c4:	80 f9 0f             	cmp    $0xf,%cl
 80496c7:	77 0d                	ja     80496d6 <submitr+0x342>
 80496c9:	b8 d9 ff 00 00       	mov    $0xffd9,%eax
 80496ce:	d3 e8                	shr    %cl,%eax
 80496d0:	83 f0 01             	xor    $0x1,%eax
 80496d3:	83 e0 01             	and    $0x1,%eax
 80496d6:	80 fa 5f             	cmp    $0x5f,%dl
 80496d9:	74 cd                	je     80496a8 <submitr+0x314>
 80496db:	84 c0                	test   %al,%al
 80496dd:	74 c9                	je     80496a8 <submitr+0x314>
 80496df:	89 d0                	mov    %edx,%eax
 80496e1:	83 e0 df             	and    $0xffffffdf,%eax
 80496e4:	83 e8 41             	sub    $0x41,%eax
 80496e7:	3c 19                	cmp    $0x19,%al
 80496e9:	76 bd                	jbe    80496a8 <submitr+0x314>
 80496eb:	80 fa 20             	cmp    $0x20,%dl
 80496ee:	74 58                	je     8049748 <submitr+0x3b4>
 80496f0:	8d 42 e0             	lea    -0x20(%edx),%eax
 80496f3:	3c 5f                	cmp    $0x5f,%al
 80496f5:	76 09                	jbe    8049700 <submitr+0x36c>
 80496f7:	80 fa 09             	cmp    $0x9,%dl
 80496fa:	0f 85 c5 03 00 00    	jne    8049ac5 <submitr+0x731>
 8049700:	83 ec 0c             	sub    $0xc,%esp
 8049703:	0f b6 d2             	movzbl %dl,%edx
 8049706:	52                   	push   %edx
 8049707:	68 54 a3 04 08       	push   $0x804a354
 804970c:	6a 08                	push   $0x8
 804970e:	6a 01                	push   $0x1
 8049710:	8d 84 24 68 80 00 00 	lea    0x8068(%esp),%eax
 8049717:	50                   	push   %eax
 8049718:	e8 a3 f1 ff ff       	call   80488c0 <__sprintf_chk@plt>
 804971d:	0f b6 84 24 6c 80 00 	movzbl 0x806c(%esp),%eax
 8049724:	00 
 8049725:	88 07                	mov    %al,(%edi)
 8049727:	0f b6 84 24 6d 80 00 	movzbl 0x806d(%esp),%eax
 804972e:	00 
 804972f:	88 47 01             	mov    %al,0x1(%edi)
 8049732:	0f b6 84 24 6e 80 00 	movzbl 0x806e(%esp),%eax
 8049739:	00 
 804973a:	88 47 02             	mov    %al,0x2(%edi)
 804973d:	83 c4 20             	add    $0x20,%esp
 8049740:	8d 7f 03             	lea    0x3(%edi),%edi
 8049743:	e9 65 ff ff ff       	jmp    80496ad <submitr+0x319>
 8049748:	c6 07 2b             	movb   $0x2b,(%edi)
 804974b:	8d 7f 01             	lea    0x1(%edi),%edi
 804974e:	e9 5a ff ff ff       	jmp    80496ad <submitr+0x319>
 8049753:	01 c6                	add    %eax,%esi
 8049755:	29 c3                	sub    %eax,%ebx
 8049757:	74 24                	je     804977d <submitr+0x3e9>
 8049759:	83 ec 04             	sub    $0x4,%esp
 804975c:	53                   	push   %ebx
 804975d:	56                   	push   %esi
 804975e:	55                   	push   %ebp
 804975f:	e8 9c f0 ff ff       	call   8048800 <write@plt>
 8049764:	83 c4 10             	add    $0x10,%esp
 8049767:	85 c0                	test   %eax,%eax
 8049769:	7f e8                	jg     8049753 <submitr+0x3bf>
 804976b:	e8 c0 f0 ff ff       	call   8048830 <__errno_location@plt>
 8049770:	83 38 04             	cmpl   $0x4,(%eax)
 8049773:	0f 85 b0 00 00 00    	jne    8049829 <submitr+0x495>
 8049779:	89 f8                	mov    %edi,%eax
 804977b:	eb d6                	jmp    8049753 <submitr+0x3bf>
 804977d:	83 7c 24 08 00       	cmpl   $0x0,0x8(%esp)
 8049782:	0f 88 a1 00 00 00    	js     8049829 <submitr+0x495>
 8049788:	89 6c 24 40          	mov    %ebp,0x40(%esp)
 804978c:	c7 44 24 44 00 00 00 	movl   $0x0,0x44(%esp)
 8049793:	00 
 8049794:	8d 44 24 4c          	lea    0x4c(%esp),%eax
 8049798:	89 44 24 48          	mov    %eax,0x48(%esp)
 804979c:	b9 00 20 00 00       	mov    $0x2000,%ecx
 80497a1:	8d 94 24 4c 20 00 00 	lea    0x204c(%esp),%edx
 80497a8:	8d 44 24 40          	lea    0x40(%esp),%eax
 80497ac:	e8 32 fb ff ff       	call   80492e3 <rio_readlineb>
 80497b1:	85 c0                	test   %eax,%eax
 80497b3:	0f 8e d6 00 00 00    	jle    804988f <submitr+0x4fb>
 80497b9:	83 ec 0c             	sub    $0xc,%esp
 80497bc:	8d 84 24 58 80 00 00 	lea    0x8058(%esp),%eax
 80497c3:	50                   	push   %eax
 80497c4:	8d 44 24 3c          	lea    0x3c(%esp),%eax
 80497c8:	50                   	push   %eax
 80497c9:	8d 84 24 60 60 00 00 	lea    0x6060(%esp),%eax
 80497d0:	50                   	push   %eax
 80497d1:	68 5b a3 04 08       	push   $0x804a35b
 80497d6:	8d 84 24 68 20 00 00 	lea    0x2068(%esp),%eax
 80497dd:	50                   	push   %eax
 80497de:	e8 2d f0 ff ff       	call   8048810 <__isoc99_sscanf@plt>
 80497e3:	8b 44 24 4c          	mov    0x4c(%esp),%eax
 80497e7:	83 c4 20             	add    $0x20,%esp
 80497ea:	3d c8 00 00 00       	cmp    $0xc8,%eax
 80497ef:	0f 84 a6 01 00 00    	je     804999b <submitr+0x607>
 80497f5:	83 ec 08             	sub    $0x8,%esp
 80497f8:	8d 94 24 54 80 00 00 	lea    0x8054(%esp),%edx
 80497ff:	52                   	push   %edx
 8049800:	50                   	push   %eax
 8049801:	68 6c a2 04 08       	push   $0x804a26c
 8049806:	6a ff                	push   $0xffffffff
 8049808:	6a 01                	push   $0x1
 804980a:	ff 74 24 30          	pushl  0x30(%esp)
 804980e:	e8 ad f0 ff ff       	call   80488c0 <__sprintf_chk@plt>
 8049813:	83 c4 14             	add    $0x14,%esp
 8049816:	55                   	push   %ebp
 8049817:	e8 84 f0 ff ff       	call   80488a0 <close@plt>
 804981c:	83 c4 10             	add    $0x10,%esp
 804981f:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
 8049824:	e9 02 02 00 00       	jmp    8049a2b <submitr+0x697>
 8049829:	8b 44 24 14          	mov    0x14(%esp),%eax
 804982d:	c7 00 45 72 72 6f    	movl   $0x6f727245,(%eax)
 8049833:	c7 40 04 72 3a 20 43 	movl   $0x43203a72,0x4(%eax)
 804983a:	c7 40 08 6c 69 65 6e 	movl   $0x6e65696c,0x8(%eax)
 8049841:	c7 40 0c 74 20 75 6e 	movl   $0x6e752074,0xc(%eax)
 8049848:	c7 40 10 61 62 6c 65 	movl   $0x656c6261,0x10(%eax)
 804984f:	c7 40 14 20 74 6f 20 	movl   $0x206f7420,0x14(%eax)
 8049856:	c7 40 18 77 72 69 74 	movl   $0x74697277,0x18(%eax)
 804985d:	c7 40 1c 65 20 74 6f 	movl   $0x6f742065,0x1c(%eax)
 8049864:	c7 40 20 20 74 68 65 	movl   $0x65687420,0x20(%eax)
 804986b:	c7 40 24 20 73 65 72 	movl   $0x72657320,0x24(%eax)
 8049872:	c7 40 28 76 65 72 00 	movl   $0x726576,0x28(%eax)
 8049879:	83 ec 0c             	sub    $0xc,%esp
 804987c:	55                   	push   %ebp
 804987d:	e8 1e f0 ff ff       	call   80488a0 <close@plt>
 8049882:	83 c4 10             	add    $0x10,%esp
 8049885:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
 804988a:	e9 9c 01 00 00       	jmp    8049a2b <submitr+0x697>
 804988f:	8b 44 24 14          	mov    0x14(%esp),%eax
 8049893:	c7 00 45 72 72 6f    	movl   $0x6f727245,(%eax)
 8049899:	c7 40 04 72 3a 20 43 	movl   $0x43203a72,0x4(%eax)
 80498a0:	c7 40 08 6c 69 65 6e 	movl   $0x6e65696c,0x8(%eax)
 80498a7:	c7 40 0c 74 20 75 6e 	movl   $0x6e752074,0xc(%eax)
 80498ae:	c7 40 10 61 62 6c 65 	movl   $0x656c6261,0x10(%eax)
 80498b5:	c7 40 14 20 74 6f 20 	movl   $0x206f7420,0x14(%eax)
 80498bc:	c7 40 18 72 65 61 64 	movl   $0x64616572,0x18(%eax)
 80498c3:	c7 40 1c 20 66 69 72 	movl   $0x72696620,0x1c(%eax)
 80498ca:	c7 40 20 73 74 20 68 	movl   $0x68207473,0x20(%eax)
 80498d1:	c7 40 24 65 61 64 65 	movl   $0x65646165,0x24(%eax)
 80498d8:	c7 40 28 72 20 66 72 	movl   $0x72662072,0x28(%eax)
 80498df:	c7 40 2c 6f 6d 20 73 	movl   $0x73206d6f,0x2c(%eax)
 80498e6:	c7 40 30 65 72 76 65 	movl   $0x65767265,0x30(%eax)
 80498ed:	66 c7 40 34 72 00    	movw   $0x72,0x34(%eax)
 80498f3:	83 ec 0c             	sub    $0xc,%esp
 80498f6:	55                   	push   %ebp
 80498f7:	e8 a4 ef ff ff       	call   80488a0 <close@plt>
 80498fc:	83 c4 10             	add    $0x10,%esp
 80498ff:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
 8049904:	e9 22 01 00 00       	jmp    8049a2b <submitr+0x697>
 8049909:	8b 44 24 14          	mov    0x14(%esp),%eax
 804990d:	c7 00 45 72 72 6f    	movl   $0x6f727245,(%eax)
 8049913:	c7 40 04 72 3a 20 43 	movl   $0x43203a72,0x4(%eax)
 804991a:	c7 40 08 6c 69 65 6e 	movl   $0x6e65696c,0x8(%eax)
 8049921:	c7 40 0c 74 20 75 6e 	movl   $0x6e752074,0xc(%eax)
 8049928:	c7 40 10 61 62 6c 65 	movl   $0x656c6261,0x10(%eax)
 804992f:	c7 40 14 20 74 6f 20 	movl   $0x206f7420,0x14(%eax)
 8049936:	c7 40 18 72 65 61 64 	movl   $0x64616572,0x18(%eax)
 804993d:	c7 40 1c 20 68 65 61 	movl   $0x61656820,0x1c(%eax)
 8049944:	c7 40 20 64 65 72 73 	movl   $0x73726564,0x20(%eax)
 804994b:	c7 40 24 20 66 72 6f 	movl   $0x6f726620,0x24(%eax)
 8049952:	c7 40 28 6d 20 73 65 	movl   $0x6573206d,0x28(%eax)
 8049959:	c7 40 2c 72 76 65 72 	movl   $0x72657672,0x2c(%eax)
 8049960:	c6 40 30 00          	movb   $0x0,0x30(%eax)
 8049964:	83 ec 0c             	sub    $0xc,%esp
 8049967:	55                   	push   %ebp
 8049968:	e8 33 ef ff ff       	call   80488a0 <close@plt>
 804996d:	83 c4 10             	add    $0x10,%esp
 8049970:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
 8049975:	e9 b1 00 00 00       	jmp    8049a2b <submitr+0x697>
 804997a:	85 c0                	test   %eax,%eax
 804997c:	74 4b                	je     80499c9 <submitr+0x635>
 804997e:	b9 00 20 00 00       	mov    $0x2000,%ecx
 8049983:	8d 94 24 4c 20 00 00 	lea    0x204c(%esp),%edx
 804998a:	8d 44 24 40          	lea    0x40(%esp),%eax
 804998e:	e8 50 f9 ff ff       	call   80492e3 <rio_readlineb>
 8049993:	85 c0                	test   %eax,%eax
 8049995:	0f 8e 6e ff ff ff    	jle    8049909 <submitr+0x575>
 804999b:	0f b6 94 24 4c 20 00 	movzbl 0x204c(%esp),%edx
 80499a2:	00 
 80499a3:	b8 0d 00 00 00       	mov    $0xd,%eax
 80499a8:	29 d0                	sub    %edx,%eax
 80499aa:	75 ce                	jne    804997a <submitr+0x5e6>
 80499ac:	0f b6 94 24 4d 20 00 	movzbl 0x204d(%esp),%edx
 80499b3:	00 
 80499b4:	b8 0a 00 00 00       	mov    $0xa,%eax
 80499b9:	29 d0                	sub    %edx,%eax
 80499bb:	75 bd                	jne    804997a <submitr+0x5e6>
 80499bd:	0f b6 84 24 4e 20 00 	movzbl 0x204e(%esp),%eax
 80499c4:	00 
 80499c5:	f7 d8                	neg    %eax
 80499c7:	eb b1                	jmp    804997a <submitr+0x5e6>
 80499c9:	b9 00 20 00 00       	mov    $0x2000,%ecx
 80499ce:	8d 94 24 4c 20 00 00 	lea    0x204c(%esp),%edx
 80499d5:	8d 44 24 40          	lea    0x40(%esp),%eax
 80499d9:	e8 05 f9 ff ff       	call   80492e3 <rio_readlineb>
 80499de:	85 c0                	test   %eax,%eax
 80499e0:	7e 68                	jle    8049a4a <submitr+0x6b6>
 80499e2:	83 ec 08             	sub    $0x8,%esp
 80499e5:	8d 84 24 54 20 00 00 	lea    0x2054(%esp),%eax
 80499ec:	50                   	push   %eax
 80499ed:	8b 7c 24 20          	mov    0x20(%esp),%edi
 80499f1:	57                   	push   %edi
 80499f2:	e8 a9 ed ff ff       	call   80487a0 <strcpy@plt>
 80499f7:	89 2c 24             	mov    %ebp,(%esp)
 80499fa:	e8 a1 ee ff ff       	call   80488a0 <close@plt>
 80499ff:	0f b6 17             	movzbl (%edi),%edx
 8049a02:	b8 4f 00 00 00       	mov    $0x4f,%eax
 8049a07:	83 c4 10             	add    $0x10,%esp
 8049a0a:	29 d0                	sub    %edx,%eax
 8049a0c:	75 13                	jne    8049a21 <submitr+0x68d>
 8049a0e:	0f b6 57 01          	movzbl 0x1(%edi),%edx
 8049a12:	b8 4b 00 00 00       	mov    $0x4b,%eax
 8049a17:	29 d0                	sub    %edx,%eax
 8049a19:	75 06                	jne    8049a21 <submitr+0x68d>
 8049a1b:	0f b6 47 02          	movzbl 0x2(%edi),%eax
 8049a1f:	f7 d8                	neg    %eax
 8049a21:	85 c0                	test   %eax,%eax
 8049a23:	0f 95 c0             	setne  %al
 8049a26:	0f b6 c0             	movzbl %al,%eax
 8049a29:	f7 d8                	neg    %eax
 8049a2b:	8b bc 24 4c a0 00 00 	mov    0xa04c(%esp),%edi
 8049a32:	65 33 3d 14 00 00 00 	xor    %gs:0x14,%edi
 8049a39:	0f 85 2a 01 00 00    	jne    8049b69 <submitr+0x7d5>
 8049a3f:	81 c4 5c a0 00 00    	add    $0xa05c,%esp
 8049a45:	5b                   	pop    %ebx
 8049a46:	5e                   	pop    %esi
 8049a47:	5f                   	pop    %edi
 8049a48:	5d                   	pop    %ebp
 8049a49:	c3                   	ret    
 8049a4a:	8b 44 24 14          	mov    0x14(%esp),%eax
 8049a4e:	c7 00 45 72 72 6f    	movl   $0x6f727245,(%eax)
 8049a54:	c7 40 04 72 3a 20 43 	movl   $0x43203a72,0x4(%eax)
 8049a5b:	c7 40 08 6c 69 65 6e 	movl   $0x6e65696c,0x8(%eax)
 8049a62:	c7 40 0c 74 20 75 6e 	movl   $0x6e752074,0xc(%eax)
 8049a69:	c7 40 10 61 62 6c 65 	movl   $0x656c6261,0x10(%eax)
 8049a70:	c7 40 14 20 74 6f 20 	movl   $0x206f7420,0x14(%eax)
 8049a77:	c7 40 18 72 65 61 64 	movl   $0x64616572,0x18(%eax)
 8049a7e:	c7 40 1c 20 73 74 61 	movl   $0x61747320,0x1c(%eax)
 8049a85:	c7 40 20 74 75 73 20 	movl   $0x20737574,0x20(%eax)
 8049a8c:	c7 40 24 6d 65 73 73 	movl   $0x7373656d,0x24(%eax)
 8049a93:	c7 40 28 61 67 65 20 	movl   $0x20656761,0x28(%eax)
 8049a9a:	c7 40 2c 66 72 6f 6d 	movl   $0x6d6f7266,0x2c(%eax)
 8049aa1:	c7 40 30 20 73 65 72 	movl   $0x72657320,0x30(%eax)
 8049aa8:	c7 40 34 76 65 72 00 	movl   $0x726576,0x34(%eax)
 8049aaf:	83 ec 0c             	sub    $0xc,%esp
 8049ab2:	55                   	push   %ebp
 8049ab3:	e8 e8 ed ff ff       	call   80488a0 <close@plt>
 8049ab8:	83 c4 10             	add    $0x10,%esp
 8049abb:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
 8049ac0:	e9 66 ff ff ff       	jmp    8049a2b <submitr+0x697>
 8049ac5:	a1 9c a2 04 08       	mov    0x804a29c,%eax
 8049aca:	8b 5c 24 14          	mov    0x14(%esp),%ebx
 8049ace:	89 03                	mov    %eax,(%ebx)
 8049ad0:	a1 db a2 04 08       	mov    0x804a2db,%eax
 8049ad5:	89 43 3f             	mov    %eax,0x3f(%ebx)
 8049ad8:	8d 7b 04             	lea    0x4(%ebx),%edi
 8049adb:	83 e7 fc             	and    $0xfffffffc,%edi
 8049ade:	29 fb                	sub    %edi,%ebx
 8049ae0:	89 d8                	mov    %ebx,%eax
 8049ae2:	be 9c a2 04 08       	mov    $0x804a29c,%esi
 8049ae7:	29 de                	sub    %ebx,%esi
 8049ae9:	83 c0 43             	add    $0x43,%eax
 8049aec:	c1 e8 02             	shr    $0x2,%eax
 8049aef:	89 c1                	mov    %eax,%ecx
 8049af1:	f3 a5                	rep movsl %ds:(%esi),%es:(%edi)
 8049af3:	83 ec 0c             	sub    $0xc,%esp
 8049af6:	55                   	push   %ebp
 8049af7:	e8 a4 ed ff ff       	call   80488a0 <close@plt>
 8049afc:	83 c4 10             	add    $0x10,%esp
 8049aff:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
 8049b04:	e9 22 ff ff ff       	jmp    8049a2b <submitr+0x697>
 8049b09:	8d 84 24 4c 40 00 00 	lea    0x404c(%esp),%eax
 8049b10:	50                   	push   %eax
 8049b11:	ff 74 24 14          	pushl  0x14(%esp)
 8049b15:	ff 74 24 14          	pushl  0x14(%esp)
 8049b19:	ff 74 24 14          	pushl  0x14(%esp)
 8049b1d:	68 e0 a2 04 08       	push   $0x804a2e0
 8049b22:	68 00 20 00 00       	push   $0x2000
 8049b27:	6a 01                	push   $0x1
 8049b29:	8d bc 24 68 20 00 00 	lea    0x2068(%esp),%edi
 8049b30:	57                   	push   %edi
 8049b31:	e8 8a ed ff ff       	call   80488c0 <__sprintf_chk@plt>
 8049b36:	b8 00 00 00 00       	mov    $0x0,%eax
 8049b3b:	b9 ff ff ff ff       	mov    $0xffffffff,%ecx
 8049b40:	f2 ae                	repnz scas %es:(%edi),%al
 8049b42:	f7 d1                	not    %ecx
 8049b44:	8d 41 ff             	lea    -0x1(%ecx),%eax
 8049b47:	89 44 24 28          	mov    %eax,0x28(%esp)
 8049b4b:	83 c4 20             	add    $0x20,%esp
 8049b4e:	89 c3                	mov    %eax,%ebx
 8049b50:	8d b4 24 4c 20 00 00 	lea    0x204c(%esp),%esi
 8049b57:	bf 00 00 00 00       	mov    $0x0,%edi
 8049b5c:	85 c0                	test   %eax,%eax
 8049b5e:	0f 85 f5 fb ff ff    	jne    8049759 <submitr+0x3c5>
 8049b64:	e9 1f fc ff ff       	jmp    8049788 <submitr+0x3f4>
 8049b69:	e8 22 ec ff ff       	call   8048790 <__stack_chk_fail@plt>

08049b6e <init_timeout>:
 8049b6e:	53                   	push   %ebx
 8049b6f:	83 ec 08             	sub    $0x8,%esp
 8049b72:	8b 5c 24 10          	mov    0x10(%esp),%ebx
 8049b76:	85 db                	test   %ebx,%ebx
 8049b78:	74 24                	je     8049b9e <init_timeout+0x30>
 8049b7a:	83 ec 08             	sub    $0x8,%esp
 8049b7d:	68 c0 92 04 08       	push   $0x80492c0
 8049b82:	6a 0e                	push   $0xe
 8049b84:	e8 d7 eb ff ff       	call   8048760 <signal@plt>
 8049b89:	85 db                	test   %ebx,%ebx
 8049b8b:	b8 00 00 00 00       	mov    $0x0,%eax
 8049b90:	0f 48 d8             	cmovs  %eax,%ebx
 8049b93:	89 1c 24             	mov    %ebx,(%esp)
 8049b96:	e8 e5 eb ff ff       	call   8048780 <alarm@plt>
 8049b9b:	83 c4 10             	add    $0x10,%esp
 8049b9e:	83 c4 08             	add    $0x8,%esp
 8049ba1:	5b                   	pop    %ebx
 8049ba2:	c3                   	ret    

08049ba3 <init_driver>:
 8049ba3:	57                   	push   %edi
 8049ba4:	56                   	push   %esi
 8049ba5:	53                   	push   %ebx
 8049ba6:	83 ec 28             	sub    $0x28,%esp
 8049ba9:	8b 74 24 38          	mov    0x38(%esp),%esi
 8049bad:	65 a1 14 00 00 00    	mov    %gs:0x14,%eax
 8049bb3:	89 44 24 24          	mov    %eax,0x24(%esp)
 8049bb7:	31 c0                	xor    %eax,%eax
 8049bb9:	6a 01                	push   $0x1
 8049bbb:	6a 0d                	push   $0xd
 8049bbd:	e8 9e eb ff ff       	call   8048760 <signal@plt>
 8049bc2:	83 c4 08             	add    $0x8,%esp
 8049bc5:	6a 01                	push   $0x1
 8049bc7:	6a 1d                	push   $0x1d
 8049bc9:	e8 92 eb ff ff       	call   8048760 <signal@plt>
 8049bce:	83 c4 08             	add    $0x8,%esp
 8049bd1:	6a 01                	push   $0x1
 8049bd3:	6a 1d                	push   $0x1d
 8049bd5:	e8 86 eb ff ff       	call   8048760 <signal@plt>
 8049bda:	83 c4 0c             	add    $0xc,%esp
 8049bdd:	6a 00                	push   $0x0
 8049bdf:	6a 01                	push   $0x1
 8049be1:	6a 02                	push   $0x2
 8049be3:	e8 68 ec ff ff       	call   8048850 <socket@plt>
 8049be8:	83 c4 10             	add    $0x10,%esp
 8049beb:	85 c0                	test   %eax,%eax
 8049bed:	0f 88 a9 00 00 00    	js     8049c9c <init_driver+0xf9>
 8049bf3:	89 c3                	mov    %eax,%ebx
 8049bf5:	83 ec 0c             	sub    $0xc,%esp
 8049bf8:	68 6c a3 04 08       	push   $0x804a36c
 8049bfd:	e8 6e ec ff ff       	call   8048870 <gethostbyname@plt>
 8049c02:	83 c4 10             	add    $0x10,%esp
 8049c05:	85 c0                	test   %eax,%eax
 8049c07:	0f 84 da 00 00 00    	je     8049ce7 <init_driver+0x144>
 8049c0d:	8d 7c 24 0c          	lea    0xc(%esp),%edi
 8049c11:	c7 44 24 0c 00 00 00 	movl   $0x0,0xc(%esp)
 8049c18:	00 
 8049c19:	c7 44 24 10 00 00 00 	movl   $0x0,0x10(%esp)
 8049c20:	00 
 8049c21:	c7 44 24 14 00 00 00 	movl   $0x0,0x14(%esp)
 8049c28:	00 
 8049c29:	c7 44 24 18 00 00 00 	movl   $0x0,0x18(%esp)
 8049c30:	00 
 8049c31:	66 c7 44 24 0c 02 00 	movw   $0x2,0xc(%esp)
 8049c38:	6a 0c                	push   $0xc
 8049c3a:	ff 70 0c             	pushl  0xc(%eax)
 8049c3d:	8b 40 10             	mov    0x10(%eax),%eax
 8049c40:	ff 30                	pushl  (%eax)
 8049c42:	8d 44 24 1c          	lea    0x1c(%esp),%eax
 8049c46:	50                   	push   %eax
 8049c47:	e8 84 eb ff ff       	call   80487d0 <__memmove_chk@plt>
 8049c4c:	66 c7 44 24 1e 3b 6e 	movw   $0x6e3b,0x1e(%esp)
 8049c53:	83 c4 0c             	add    $0xc,%esp
 8049c56:	6a 10                	push   $0x10
 8049c58:	57                   	push   %edi
 8049c59:	53                   	push   %ebx
 8049c5a:	e8 31 ec ff ff       	call   8048890 <connect@plt>
 8049c5f:	83 c4 10             	add    $0x10,%esp
 8049c62:	85 c0                	test   %eax,%eax
 8049c64:	0f 88 e9 00 00 00    	js     8049d53 <init_driver+0x1b0>
 8049c6a:	83 ec 0c             	sub    $0xc,%esp
 8049c6d:	53                   	push   %ebx
 8049c6e:	e8 2d ec ff ff       	call   80488a0 <close@plt>
 8049c73:	66 c7 06 4f 4b       	movw   $0x4b4f,(%esi)
 8049c78:	c6 46 02 00          	movb   $0x0,0x2(%esi)
 8049c7c:	83 c4 10             	add    $0x10,%esp
 8049c7f:	b8 00 00 00 00       	mov    $0x0,%eax
 8049c84:	8b 54 24 1c          	mov    0x1c(%esp),%edx
 8049c88:	65 33 15 14 00 00 00 	xor    %gs:0x14,%edx
 8049c8f:	0f 85 eb 00 00 00    	jne    8049d80 <init_driver+0x1dd>
 8049c95:	83 c4 20             	add    $0x20,%esp
 8049c98:	5b                   	pop    %ebx
 8049c99:	5e                   	pop    %esi
 8049c9a:	5f                   	pop    %edi
 8049c9b:	c3                   	ret    
 8049c9c:	c7 06 45 72 72 6f    	movl   $0x6f727245,(%esi)
 8049ca2:	c7 46 04 72 3a 20 43 	movl   $0x43203a72,0x4(%esi)
 8049ca9:	c7 46 08 6c 69 65 6e 	movl   $0x6e65696c,0x8(%esi)
 8049cb0:	c7 46 0c 74 20 75 6e 	movl   $0x6e752074,0xc(%esi)
 8049cb7:	c7 46 10 61 62 6c 65 	movl   $0x656c6261,0x10(%esi)
 8049cbe:	c7 46 14 20 74 6f 20 	movl   $0x206f7420,0x14(%esi)
 8049cc5:	c7 46 18 63 72 65 61 	movl   $0x61657263,0x18(%esi)
 8049ccc:	c7 46 1c 74 65 20 73 	movl   $0x73206574,0x1c(%esi)
 8049cd3:	c7 46 20 6f 63 6b 65 	movl   $0x656b636f,0x20(%esi)
 8049cda:	66 c7 46 24 74 00    	movw   $0x74,0x24(%esi)
 8049ce0:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
 8049ce5:	eb 9d                	jmp    8049c84 <init_driver+0xe1>
 8049ce7:	c7 06 45 72 72 6f    	movl   $0x6f727245,(%esi)
 8049ced:	c7 46 04 72 3a 20 44 	movl   $0x44203a72,0x4(%esi)
 8049cf4:	c7 46 08 4e 53 20 69 	movl   $0x6920534e,0x8(%esi)
 8049cfb:	c7 46 0c 73 20 75 6e 	movl   $0x6e752073,0xc(%esi)
 8049d02:	c7 46 10 61 62 6c 65 	movl   $0x656c6261,0x10(%esi)
 8049d09:	c7 46 14 20 74 6f 20 	movl   $0x206f7420,0x14(%esi)
 8049d10:	c7 46 18 72 65 73 6f 	movl   $0x6f736572,0x18(%esi)
 8049d17:	c7 46 1c 6c 76 65 20 	movl   $0x2065766c,0x1c(%esi)
 8049d1e:	c7 46 20 73 65 72 76 	movl   $0x76726573,0x20(%esi)
 8049d25:	c7 46 24 65 72 20 61 	movl   $0x61207265,0x24(%esi)
 8049d2c:	c7 46 28 64 64 72 65 	movl   $0x65726464,0x28(%esi)
 8049d33:	66 c7 46 2c 73 73    	movw   $0x7373,0x2c(%esi)
 8049d39:	c6 46 2e 00          	movb   $0x0,0x2e(%esi)
 8049d3d:	83 ec 0c             	sub    $0xc,%esp
 8049d40:	53                   	push   %ebx
 8049d41:	e8 5a eb ff ff       	call   80488a0 <close@plt>
 8049d46:	83 c4 10             	add    $0x10,%esp
 8049d49:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
 8049d4e:	e9 31 ff ff ff       	jmp    8049c84 <init_driver+0xe1>
 8049d53:	83 ec 0c             	sub    $0xc,%esp
 8049d56:	68 6c a3 04 08       	push   $0x804a36c
 8049d5b:	68 2c a3 04 08       	push   $0x804a32c
 8049d60:	6a ff                	push   $0xffffffff
 8049d62:	6a 01                	push   $0x1
 8049d64:	56                   	push   %esi
 8049d65:	e8 56 eb ff ff       	call   80488c0 <__sprintf_chk@plt>
 8049d6a:	83 c4 14             	add    $0x14,%esp
 8049d6d:	53                   	push   %ebx
 8049d6e:	e8 2d eb ff ff       	call   80488a0 <close@plt>
 8049d73:	83 c4 10             	add    $0x10,%esp
 8049d76:	b8 ff ff ff ff       	mov    $0xffffffff,%eax
 8049d7b:	e9 04 ff ff ff       	jmp    8049c84 <init_driver+0xe1>
 8049d80:	e8 0b ea ff ff       	call   8048790 <__stack_chk_fail@plt>

08049d85 <driver_post>:
 8049d85:	53                   	push   %ebx
 8049d86:	83 ec 08             	sub    $0x8,%esp
 8049d89:	8b 54 24 10          	mov    0x10(%esp),%edx
 8049d8d:	8b 44 24 18          	mov    0x18(%esp),%eax
 8049d91:	8b 5c 24 1c          	mov    0x1c(%esp),%ebx
 8049d95:	85 c0                	test   %eax,%eax
 8049d97:	75 17                	jne    8049db0 <driver_post+0x2b>
 8049d99:	85 d2                	test   %edx,%edx
 8049d9b:	74 05                	je     8049da2 <driver_post+0x1d>
 8049d9d:	80 3a 00             	cmpb   $0x0,(%edx)
 8049da0:	75 34                	jne    8049dd6 <driver_post+0x51>
 8049da2:	66 c7 03 4f 4b       	movw   $0x4b4f,(%ebx)
 8049da7:	c6 43 02 00          	movb   $0x0,0x2(%ebx)
 8049dab:	83 c4 08             	add    $0x8,%esp
 8049dae:	5b                   	pop    %ebx
 8049daf:	c3                   	ret    
 8049db0:	83 ec 04             	sub    $0x4,%esp
 8049db3:	ff 74 24 18          	pushl  0x18(%esp)
 8049db7:	68 7a a3 04 08       	push   $0x804a37a
 8049dbc:	6a 01                	push   $0x1
 8049dbe:	e8 7d ea ff ff       	call   8048840 <__printf_chk@plt>
 8049dc3:	66 c7 03 4f 4b       	movw   $0x4b4f,(%ebx)
 8049dc8:	c6 43 02 00          	movb   $0x0,0x2(%ebx)
 8049dcc:	83 c4 10             	add    $0x10,%esp
 8049dcf:	b8 00 00 00 00       	mov    $0x0,%eax
 8049dd4:	eb d5                	jmp    8049dab <driver_post+0x26>
 8049dd6:	83 ec 04             	sub    $0x4,%esp
 8049dd9:	53                   	push   %ebx
 8049dda:	ff 74 24 1c          	pushl  0x1c(%esp)
 8049dde:	68 91 a3 04 08       	push   $0x804a391
 8049de3:	52                   	push   %edx
 8049de4:	68 99 a3 04 08       	push   $0x804a399
 8049de9:	68 6e 3b 00 00       	push   $0x3b6e
 8049dee:	68 6c a3 04 08       	push   $0x804a36c
 8049df3:	e8 9c f5 ff ff       	call   8049394 <submitr>
 8049df8:	83 c4 20             	add    $0x20,%esp
 8049dfb:	eb ae                	jmp    8049dab <driver_post+0x26>
 8049dfd:	66 90                	xchg   %ax,%ax
 8049dff:	90                   	nop

08049e00 <__libc_csu_init>:
 8049e00:	55                   	push   %ebp
 8049e01:	57                   	push   %edi
 8049e02:	56                   	push   %esi
 8049e03:	53                   	push   %ebx
 8049e04:	e8 07 eb ff ff       	call   8048910 <__x86.get_pc_thunk.bx>
 8049e09:	81 c3 f7 21 00 00    	add    $0x21f7,%ebx
 8049e0f:	83 ec 0c             	sub    $0xc,%esp
 8049e12:	8b 6c 24 20          	mov    0x20(%esp),%ebp
 8049e16:	8d b3 0c ff ff ff    	lea    -0xf4(%ebx),%esi
 8049e1c:	e8 d3 e8 ff ff       	call   80486f4 <_init>
 8049e21:	8d 83 08 ff ff ff    	lea    -0xf8(%ebx),%eax
 8049e27:	29 c6                	sub    %eax,%esi
 8049e29:	c1 fe 02             	sar    $0x2,%esi
 8049e2c:	85 f6                	test   %esi,%esi
 8049e2e:	74 25                	je     8049e55 <__libc_csu_init+0x55>
 8049e30:	31 ff                	xor    %edi,%edi
 8049e32:	8d b6 00 00 00 00    	lea    0x0(%esi),%esi
 8049e38:	83 ec 04             	sub    $0x4,%esp
 8049e3b:	ff 74 24 2c          	pushl  0x2c(%esp)
 8049e3f:	ff 74 24 2c          	pushl  0x2c(%esp)
 8049e43:	55                   	push   %ebp
 8049e44:	ff 94 bb 08 ff ff ff 	call   *-0xf8(%ebx,%edi,4)
 8049e4b:	83 c7 01             	add    $0x1,%edi
 8049e4e:	83 c4 10             	add    $0x10,%esp
 8049e51:	39 fe                	cmp    %edi,%esi
 8049e53:	75 e3                	jne    8049e38 <__libc_csu_init+0x38>
 8049e55:	83 c4 0c             	add    $0xc,%esp
 8049e58:	5b                   	pop    %ebx
 8049e59:	5e                   	pop    %esi
 8049e5a:	5f                   	pop    %edi
 8049e5b:	5d                   	pop    %ebp
 8049e5c:	c3                   	ret    
 8049e5d:	8d 76 00             	lea    0x0(%esi),%esi

08049e60 <__libc_csu_fini>:
 8049e60:	f3 c3                	repz ret 

Disassembly of section .fini:

08049e64 <_fini>:
 8049e64:	53                   	push   %ebx
 8049e65:	83 ec 08             	sub    $0x8,%esp
 8049e68:	e8 a3 ea ff ff       	call   8048910 <__x86.get_pc_thunk.bx>
 8049e6d:	81 c3 93 21 00 00    	add    $0x2193,%ebx
 8049e73:	83 c4 08             	add    $0x8,%esp
 8049e76:	5b                   	pop    %ebx
 8049e77:	c3                   	ret    
