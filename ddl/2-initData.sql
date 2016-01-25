----create at 2012.10.15----

-- ORGAN
insert into ORGAN (ID, OPTIMISTIC_LOCK, F_NAME, PARENT_ORGAN_ID, PATH) values ('0000000000900000000000000310000', 1, '��ʼ������', null, '/0000000000900000000000000310000');

-- EP_ROLE
insert into EP_ROLE(ID, NAME, NOTE, ORGAN_ID,IS_SUSPENDED,CREATE_USER_NAME,TYPE) values ('0000000000900000000000000340000', '����Ա', 'ϵͳ�Զ���', '0000000000900000000000000310000',0, 'admin',1);
insert into EP_ROLE(ID, NAME, NOTE, ORGAN_ID,IS_SUSPENDED,CREATE_USER_NAME,TYPE) values ('0000000000900000000000000340001', '��ͨ�û�', 'ϵͳ�Զ���', '0000000000900000000000000310000',0, 'admin',1);

-- COMPANY
insert into COMPANY (ORGAN_ID, NOTE, LINKMAN, EMAIL, PHONE, FAX, ADDRESS, POSTALCODE, IS_SUSPENDED, F_NUMBER, O_ORGAN_ID, CREATETIME, IS_MSP) values ('0000000000900000000000000310000', null, null, null, null, null, null, null, 0, '01000120000001', '0000000000000000000000000000001', 1250579159825, 0);

-- T_USER
insert into T_USER (ID, OPTIMISTIC_LOCK, NOTE, ORGAN_ID, LOGON_NAME, F_PASSWORD, F_NAME, NAMING, AGE, SEX, MOBILE, EMAIL, PHONE, IS_SUSPENDED, SESSION_MAX_AMOUNT, BIND_SOFTDOG, CREATETIME, STD_ID, PRIORITY, MONITOR_ROLE, PERMISSION_MODE, PERMISSION_CHANGE, EXPIRED_DAY, BILL_MODE, DISPATCH_SERVER_ID, USER_ACCOUNT, IS_PHONE_NOTIFY, IS_EMAIL_NOTIFY, SMS_SEND_RULE, AUDIO_ID, AUDIO_SEND_RULE, IS_AUDIO_NOTIFY, VIP, IS_MSP) values (lpad(TUSER_SEQ.nextval, 31, '0'), 7, null, '0000000000900000000000000310000', 'admin', 'e10adc3949ba59abbe56e057f20f883e', 'megaeyes', '', 23, '0', '13888888888', 'xxxx@hxht.com', '028-99999999', 0, 4, 0, 1270007149404, null, 0, 0, null, 1, null, null, null, '1', 0, 0, null, null, null, 0, null, 0);

-- ALARM_INPUT_CHANNEL_TYPE
insert into ALARM_INPUT_CHANNEL_TYPE (ID, OPTIMISTIC_LOCK, F_NAME, IS_CONTROLLABLE_BY_USER, DESCRIBE) values (lpad(ALARMINPUTCHANNELTYPE_SEQ.nextval, 31, '0'), 1, '�̸�', 0, '������Ӧ��');
insert into ALARM_INPUT_CHANNEL_TYPE (ID, OPTIMISTIC_LOCK, F_NAME, IS_CONTROLLABLE_BY_USER, DESCRIBE) values (lpad(ALARMINPUTCHANNELTYPE_SEQ.nextval, 31, '0'), 1, '�Ŵ�', 0, '�Ŵ�');
insert into ALARM_INPUT_CHANNEL_TYPE (ID, OPTIMISTIC_LOCK, F_NAME, IS_CONTROLLABLE_BY_USER, DESCRIBE) values (lpad(ALARMINPUTCHANNELTYPE_SEQ.nextval, 31, '0'), 1, '�������豸', 0, '�������豸');
insert into ALARM_INPUT_CHANNEL_TYPE (ID, OPTIMISTIC_LOCK, F_NAME, IS_CONTROLLABLE_BY_USER, DESCRIBE) values (lpad(ALARMINPUTCHANNELTYPE_SEQ.nextval, 31, '0'), 1, '����Χ��', 0, '����Χ��');
insert into ALARM_INPUT_CHANNEL_TYPE (ID, OPTIMISTIC_LOCK, F_NAME, IS_CONTROLLABLE_BY_USER, DESCRIBE) values (lpad(ALARMINPUTCHANNELTYPE_SEQ.nextval, 31, '0'), 1, '���ֱ�����', 0, '���ֱ�����');
insert into ALARM_INPUT_CHANNEL_TYPE (ID, OPTIMISTIC_LOCK, F_NAME, IS_CONTROLLABLE_BY_USER, DESCRIBE) values (lpad(ALARMINPUTCHANNELTYPE_SEQ.nextval, 31, '0'), 1, '��ˮ̽����', 0, '��ˮ̽����');
insert into ALARM_INPUT_CHANNEL_TYPE (ID, OPTIMISTIC_LOCK, F_NAME, IS_CONTROLLABLE_BY_USER, DESCRIBE) values (lpad(ALARMINPUTCHANNELTYPE_SEQ.nextval, 31, '0'), 1, '�𶯱�����', 0, '�𶯱�����');
insert into ALARM_INPUT_CHANNEL_TYPE (ID, OPTIMISTIC_LOCK, F_NAME, IS_CONTROLLABLE_BY_USER, DESCRIBE) values (lpad(ALARMINPUTCHANNELTYPE_SEQ.nextval, 31, '0'), 1, '�ֶ�������', 1, '�ֶ�������');

-- ALARM_OUTPUT_CHANNEL_TYPE
insert into ALARM_OUTPUT_CHANNEL_TYPE (ID, OPTIMISTIC_LOCK, F_NAME, IS_CONTROLLABLE_BY_USER, DESCRIBE) values (lpad(ALARMOUTPUTCHANNELTYPE_SEQ.nextval, 31, '0'), 1, '�ƹ�', 1, '�ƹ����');
insert into ALARM_OUTPUT_CHANNEL_TYPE (ID, OPTIMISTIC_LOCK, F_NAME, IS_CONTROLLABLE_BY_USER, DESCRIBE) values (lpad(ALARMOUTPUTCHANNELTYPE_SEQ.nextval, 31, '0'), 1, '����', 0, '�������');
insert into ALARM_OUTPUT_CHANNEL_TYPE (ID, OPTIMISTIC_LOCK, F_NAME, IS_CONTROLLABLE_BY_USER, DESCRIBE) values (lpad(ALARMOUTPUTCHANNELTYPE_SEQ.nextval, 31, '0'), 1, '�յ�', 1, '�յ�');
insert into ALARM_OUTPUT_CHANNEL_TYPE (ID, OPTIMISTIC_LOCK, F_NAME, IS_CONTROLLABLE_BY_USER, DESCRIBE) values (lpad(ALARMOUTPUTCHANNELTYPE_SEQ.nextval, 31, '0'), 1, '���', 1, '���');
insert into ALARM_OUTPUT_CHANNEL_TYPE (ID, OPTIMISTIC_LOCK, F_NAME, IS_CONTROLLABLE_BY_USER, DESCRIBE) values (lpad(ALARMOUTPUTCHANNELTYPE_SEQ.nextval, 31, '0'), 1, '���ⱨ����', 1, '���ⱨ����');

-- EP_PROBER_TYPE
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('19', '̫����̽����', '0', '1');
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('20', '����', '2', null);
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('21', '����', '2', null);
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('22', '����', '2', null);
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('23', '��ѹ', '2', null);
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('24', '������', '2', null);
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('1', '�¶Ȳɼ��豸', '2', null);
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('2', 'ʪ�Ȳɼ��豸', '2', null);
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('3', '��ѹ�ɼ��豸', '2', null);
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('4', '�������豸', '1', '1');
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('5', '�̸�', '1', '1');
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('6', '����Χ��', '1', '1');
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('7', '���ֱ�����', '1', '1');
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('8', '�𶯱�����', '1', '1');
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('9', '��ˮ̽����', '1', '1');
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('10', '�յ�', '1', '2');
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('11', '���', '1', '2');
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('12', '��', '1', '2');
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('13', '����', '1', '2');
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('14', '���ⱨ����', '1', '2');
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('15', '�Ŵ�', '1', '2');
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('16', '�����ɼ��豸', '2', null);
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('17', '����̽ͷ', '2', null);
insert into EP_PROBER_TYPE (ID, NAME, TYPE, DIGITAL_TYPE) values ('18', '�ֶ�������', '1', '1');

-- MANUFACTURER
insert into MANUFACTURER (ID, OPTIMISTIC_LOCK, F_NAME, NOTE) values ('0000000000900000000000001400000', 1, 'HIKMP', 'HIKMP');
insert into MANUFACTURER (ID, OPTIMISTIC_LOCK, F_NAME, NOTE) values (lpad(MANUFACTURER_SEQ.nextval, 31, '0'), 1, 'AXIS', 'AXIS');
insert into MANUFACTURER (ID, OPTIMISTIC_LOCK, F_NAME, NOTE) values (lpad(MANUFACTURER_SEQ.nextval, 31, '0'), 1, '����������', '������');
insert into MANUFACTURER (ID, OPTIMISTIC_LOCK, F_NAME, NOTE) values (lpad(MANUFACTURER_SEQ.nextval, 31, '0'), 1, '�ʳ�', 'IPC_200');
insert into MANUFACTURER (ID, OPTIMISTIC_LOCK, F_NAME, NOTE) values (lpad(MANUFACTURER_SEQ.nextval, 31, '0'), 1, '����', 'IPC_100');
insert into MANUFACTURER (ID, OPTIMISTIC_LOCK, F_NAME, NOTE) values (lpad(MANUFACTURER_SEQ.nextval, 31, '0'), 0, 'DAHUA', '�󻪣���Ƶ����������');

-- VIDEO_INPUT_CHANNEL_MODEL
insert into VIDEO_INPUT_CHANNEL_MODEL (ID, OPTIMISTIC_LOCK, MANUFACTURER_ID, F_NAME, HAS_PTZ, HAS_PTZ_APERTURE, HAS_PTZ_FOCI, HAS_PTZ_ZOOM, HAS_PTZ_ASW_1, HAS_PTZ_ASW_2, HAS_PTZ_ASW_3, HAS_PTZ_ASW_4, HAS_PTZ_AUTO, HAS_SENSE, HAS_SHELTER, HAS_TIME_LABEL, HAS_TEXT_LABEL, NOTE) values (lpad(VIDEOINPUTCHANNELMODEL_SEQ.nextval, 31, '0'), 0, '0000000000900000000000001400000', '���', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, '���');
insert into VIDEO_INPUT_CHANNEL_MODEL (ID, OPTIMISTIC_LOCK, MANUFACTURER_ID, F_NAME, HAS_PTZ, HAS_PTZ_APERTURE, HAS_PTZ_FOCI, HAS_PTZ_ZOOM, HAS_PTZ_ASW_1, HAS_PTZ_ASW_2, HAS_PTZ_ASW_3, HAS_PTZ_ASW_4, HAS_PTZ_AUTO, HAS_SENSE, HAS_SHELTER, HAS_TIME_LABEL, HAS_TEXT_LABEL, NOTE) values (lpad(VIDEOINPUTCHANNELMODEL_SEQ.nextval, 31, '0'), 0, '0000000000900000000000001400000', 'ǹ��', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'ǹ��');
insert into VIDEO_INPUT_CHANNEL_MODEL (ID, OPTIMISTIC_LOCK, MANUFACTURER_ID, F_NAME, HAS_PTZ, HAS_PTZ_APERTURE, HAS_PTZ_FOCI, HAS_PTZ_ZOOM, HAS_PTZ_ASW_1, HAS_PTZ_ASW_2, HAS_PTZ_ASW_3, HAS_PTZ_ASW_4, HAS_PTZ_AUTO, HAS_SENSE, HAS_SHELTER, HAS_TIME_LABEL, HAS_TEXT_LABEL, NOTE) values (lpad(VIDEOINPUTCHANNELMODEL_SEQ.nextval, 31, '0'), 0, '0000000000900000000000001400000', '����', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, '����');

-- VIDEO_INPUT_SERVER_MODEL
insert into VIDEO_INPUT_SERVER_MODEL (ID, OPTIMISTIC_LOCK, F_NAME, F_TYPE, ENCODE, NOTE, MANUFACTURER_ID, DECODE, RTP_PAYLOAD) values (lpad(VIDEOINPUTSERVERMODEL_SEQ.nextval, 31, '0'), 0, 'HIK9000', 'general_camera_video_server', 'HIKMP4.2.5', null, '0000000000900000000000001400000', null, '111');
insert into VIDEO_INPUT_SERVER_MODEL (ID, OPTIMISTIC_LOCK, F_NAME, F_TYPE, ENCODE, NOTE, MANUFACTURER_ID, DECODE, RTP_PAYLOAD) values (lpad(VIDEOINPUTSERVERMODEL_SEQ.nextval, 31, '0'), 0, 'DAHUA', 'general_camera_video_server', 'HIKMP4.2.5', null, '0000000000900000000000001400000', null, '115');
insert into VIDEO_INPUT_SERVER_MODEL (ID, OPTIMISTIC_LOCK, F_NAME, F_TYPE, ENCODE, NOTE, MANUFACTURER_ID, DECODE, RTP_PAYLOAD) values (lpad(VIDEOINPUTSERVERMODEL_SEQ.nextval, 31, '0'), 0, 'LANGCHI', 'general_camera_video_server', 'HIKMP4.2.5', null, '0000000000900000000000001400000', null, '120');
insert into VIDEO_INPUT_SERVER_MODEL (ID, OPTIMISTIC_LOCK, F_NAME, F_TYPE, ENCODE, NOTE, MANUFACTURER_ID, DECODE, RTP_PAYLOAD) values (lpad(VIDEOINPUTSERVERMODEL_SEQ.nextval, 31, '0'), 0, 'HIK8000', 'general_camera_video_server', 'HIKMP4.2.5', null, '0000000000900000000000001400000', null, '110');

-- VIDEO_OUTPUT_CHANNEL_MODEL
insert into VIDEO_OUTPUT_CHANNEL_MODEL (ID, OPTIMISTIC_LOCK, MANUFACTURER_ID, F_NAME, NOTE) values (lpad(VIDEOOUTPUTCHANNELMODEL_SEQ.nextval, 31, '0'), 1, '0000000000900000000000001400000', '������', '������');

-- PLATFORM
insert into PLATFORM (ID, OPTIMISTIC_LOCK, F_NAME, CMS_ID, LOCATION, VERIFY, NOTE, PASSWORD, USER_NOTIFY_SERVER_IP, USER_NOTIFY_SERVER_PORT, USER_NOTIFY_SERVER_URL, USER_NOTIFY_SERVER_LOGINNAME, USER_NOTIFY_SERVER_PASSWORD, SMS_NOTIFY_TYPE, SP_CODE, CDR_SERVER_IP, CDR_SERVER_PORT, HTTPS_FLAG) values ('0000000000000000000000000000001', 1, 'MEGAEYES', '010001', 'BEIJING', null, null, null, null, 8080, null, null, null, 0, null, null, 8080, 0);

-- rtp_payload
insert into rtp_payload values(lpad(rtp_payload_seq.nextval, 31, '0'), '110', 'HIKMP4.2.5', 90000, '34484b48feb3d0d608030420000000000310011001101000803e0000c00240021110000005000000', '����HIK264��Ƶ', '4CIF=1', 'profile-level-id=420028;sprop-parameter-sets=34484b48feb3d0d608030420000000000310011001101000803e0000c00240021110000005000000');
insert into rtp_payload values(lpad(rtp_payload_seq.nextval, 31, '0'), '111', 'HIKMP4.2.5', 90000, '494d4b48010100000200010021720110007d0000007d000000000000000000000000000000000000', '����HIK264��Ƶ', '4CIF=1', 'profile-level-id=420028;sprop-parameter-sets=494d4b48010100000200010021720110007d0000007d000000000000000000000000000000000000');
insert into rtp_payload values(lpad(rtp_payload_seq.nextval, 31, '0'), '115', 'DAHUA_MP4_V1.0', 90000, '4448505400', '����Ƶ', '4CIF=1', 'profile-level-id=420028;sprop-parameter-sets=4448505400');
insert into rtp_payload values(lpad(rtp_payload_seq.nextval, 31, '0'), '120', 'LAUNCHDIGITAL', 90000, '4c41554e43484449474954414c000000010000004832363401000000600120011400010001001800401f000000000000000000000000000000000000', '�ʳ���Ƶ', '4CIF=1', 'profile-level-id=420028;sprop-parameter-sets=4c41554e43484449474954414c000000010000004832363401000000600120011400010001001800401f000000000000000000000000000000000000');

-- branch
--insert into branch values(lpad(branch_seq.nextval, 31, '0'), '��������', null, null, null);

-- t_user
--update t_user set branch_id = (select id from branch where rownum = 1);

-- EP_INSTALL_ADDRESS
insert into EP_INSTALL_ADDRESS (ID, NAME, LINE_BACK_FEW, TOWER_NUMBER, SWITCHES_IP, SERIAL_SERVER_IP, VOLTAGE_LEVEL, AREA_BELONGS, INSTALLATION_POSITION, TYPE) values (lpad(ep_install_address_seq.nextval, 31, '0'), '��������', null, null, null, null, null, '��������', '1', '3');

-- video_input_server
update video_input_server set install_location = (select id from ep_install_address where rownum = 1);

-- ep_event_type
insert into ep_event_type (id, code, name, standard_type) values (lpad(ep_event_type_seq.nextval, 31, '0'), '1', '��Ƶ��ʧ�澯', '1');
insert into ep_event_type (id, code, name, standard_type) values (lpad(ep_event_type_seq.nextval, 31, '0'), '2', '�ƶ����澯', '1');
insert into ep_event_type (id, code, name, standard_type) values (lpad(ep_event_type_seq.nextval, 31, '0'), '4', '��Ƶ�ڵ��澯', '1');
insert into ep_event_type (id, code, name, standard_type) values (lpad(ep_event_type_seq.nextval, 31, '0'), '8', '��Ƶ���ָ澯', '1');
insert into ep_event_type (id, code, name, standard_type) values (lpad(ep_event_type_seq.nextval, 31, '0'), '16', '��Ƶ�ܽ�����澯', '1');
insert into ep_event_type (id, code, name, standard_type) values (lpad(ep_event_type_seq.nextval, 31, '0'), '32', '��Ƶ�����澯', '1');
insert into ep_event_type (id, code, name, standard_type) values (lpad(ep_event_type_seq.nextval, 31, '0'), '64', '��Ƶ������Ʒ�����澯', '1');
insert into ep_event_type (id, code, name, standard_type) values (lpad(ep_event_type_seq.nextval, 31, '0'), '256', '�豸���¸澯', '1');
insert into ep_event_type (id, code, name, standard_type) values (lpad(ep_event_type_seq.nextval, 31, '0'), '512', '�豸���¸澯', '1');
insert into ep_event_type (id, code, name, standard_type) values (lpad(ep_event_type_seq.nextval, 31, '0'), '1024', '���ȹ��ϸ澯', '1');
insert into ep_event_type (id, code, name, standard_type) values (lpad(ep_event_type_seq.nextval, 31, '0'), '2048', '���̹��ϸ澯', '1');
insert into ep_event_type (id, code, name, standard_type) values (lpad(ep_event_type_seq.nextval, 31, '0'), '65536', '״̬�¼��澯', '1');
insert into ep_event_type (id, code, name, standard_type) values (lpad(ep_event_type_seq.nextval, 31, '0'), '131072', '�������뱨��', '1');
insert into ep_event_type (id, code, name, standard_type) values (lpad(ep_event_type_seq.nextval, 31, '0'), '1048576', '��ʱ¼���¼�', '1');
insert into ep_event_type (id, code, name, standard_type) values (lpad(ep_event_type_seq.nextval, 31, '0'), '2097152', '�û�����¼���¼�', '1');
insert into ep_event_type (id, code, name, standard_type) values (lpad(ep_event_type_seq.nextval, 31, '0'), '262144', '�Ž�ˢ���¼�', '1');
insert into ep_event_type (id, code, name, standard_type) values (lpad(ep_event_type_seq.nextval, 31, '0'), '524288', '�Ž�����', '1');
insert into ep_event_type values(lpad(ep_event_type_seq.nextval, 31, '0'), '4096', '̽�����澯', '1');

-- EP_DEVICE
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500001', '���ܻ���', '0', null, 4, null, '000');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500002', '�ȵ���', '0', '0000000000200020000000000500001', 4, null, '000');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500003', '�к�����', '0', '0000000000200020000000000500001', 4, null, '000');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500004', 'ˮ��', '0', '0000000000200020000000000500001', 4, null, '001');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500005', 'վ�õ�', '0', '0000000000200020000000000500001', 4, null, '001');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500006', '΢����', '0', '0000000000200020000000000500001', 4, null, '100');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500007', '��������', '0', '0000000000200020000000000500001', 4, null, '000');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500008', '���ѹ����', '0', '0000000000200020000000000500002', 4, null, '001');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500009', '��������', '0', '0000000000200020000000000500002', 4, null, '001');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500010', '������', '0', '0000000000200020000000000500002', 4, null, '001');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500011', '������ʪ��', '0', '0000000000200020000000000500002', 4, null, '001');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500012', 'GIS�豸��', '0', '0000000000200020000000000500003', 4, null, '001');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500013', '�¶�', '0', '0000000000200020000000000500006', 4, null, '100');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500014', 'ʪ��', '0', '0000000000200020000000000500006', 4, null, '100');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500015', '����', '0', '0000000000200020000000000500006', 4, null, '100');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500016', '����', '0', '0000000000200020000000000500006', 4, null, '100');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500017', '��ѹ', '0', '0000000000200020000000000500006', 4, null, '100');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500018', '���', '0', '0000000000200020000000000500007', 4, null, '100');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500020', '�յ�', '0', '0000000000200020000000000500007', 4, null, '100');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500021', '����̽����', '0', '0000000000200020000000000500007', 4, null, '100');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500022', '����Χ��', '0', '0000000000200020000000000500007', 4, null, '100');
insert into EP_DEVICE (ID, NAME, ORGAN_ID, PARENT_ID, TYPE, NOTE, OPERATION) values ('0000000000200020000000000500023', '�Ŵ�', '0', '0000000000200020000000000500007', 4, null, '100');

-- EP_OPERATION
insert into EP_OPERATION (ID, NAME, NOTE, PARENT_ID, OPERATION_NUMBER) values ('0000000000200020000000004000000', '��Ƶ���', null, null, '01');
insert into EP_OPERATION (ID, NAME, NOTE, PARENT_ID, OPERATION_NUMBER) values ('0000000000200020000000004000001', '���ܻ���', null, null, '02');
insert into EP_OPERATION (ID, NAME, NOTE, PARENT_ID, OPERATION_NUMBER) values ('0000000000200020000000004000002', '�����', null, null, '03');
insert into EP_OPERATION (ID, NAME, NOTE, PARENT_ID, OPERATION_NUMBER) values ('0000000000200020000000004000003', '���ӵ�ͼ', null, null, '04');
insert into EP_OPERATION (ID, NAME, NOTE, PARENT_ID, OPERATION_NUMBER) values ('0000000000200020000000004000004', '�豸Ѳ��', null, null, '05');
insert into EP_OPERATION (ID, NAME, NOTE, PARENT_ID, OPERATION_NUMBER) values ('0000000000200020000000004000005', '�Ž����', null, null, '06');
insert into EP_OPERATION (ID, NAME, NOTE, PARENT_ID, OPERATION_NUMBER) values ('0000000000200020000000004000006', '������Ϣ', null, null, '07');
insert into EP_OPERATION (ID, NAME, NOTE, PARENT_ID, OPERATION_NUMBER) values ('0000000000200020000000004000007', '�ʲ�����', null, null, '08');
insert into EP_OPERATION (ID, NAME, NOTE, PARENT_ID, OPERATION_NUMBER) values ('0000000000200020000000004000008', '��Ƶ����', null, null, '09');
insert into EP_OPERATION (ID, NAME, NOTE, PARENT_ID, OPERATION_NUMBER) values ('0000000000200020000000004000009', 'Ӧ��ָ��', null, null, '10');
insert into EP_OPERATION (ID, NAME, NOTE, PARENT_ID, OPERATION_NUMBER) values ('0000000000200020000000004000010', '��̨����', null, null, '90');
insert into EP_OPERATION (ID, NAME, NOTE, PARENT_ID, OPERATION_NUMBER) values ('0000000000200020000000004000011', 'ʵʱ��Ƶ', null, '0000000000200020000000004000000', '0101');
insert into EP_OPERATION (ID, NAME, NOTE, PARENT_ID, OPERATION_NUMBER) values ('0000000000200020000000004000012', '��ʷ��Ƶ', null, '0000000000200020000000004000000', '0102');
insert into EP_OPERATION (ID, NAME, NOTE, PARENT_ID, OPERATION_NUMBER) values ('0000000000200020000000004000013', '��̨����', null, '0000000000200020000000004000000', '0103');
insert into EP_OPERATION (ID, NAME, NOTE, PARENT_ID, OPERATION_NUMBER) values ('0000000000200020000000004000014', '��Ƶ��������', null, '0000000000200020000000004000000', '0104');
insert into EP_OPERATION (ID, NAME, NOTE, PARENT_ID, OPERATION_NUMBER) values ('0000000000200020000000004000015', '����ǽ', null, '0000000000200020000000004000000', '0105');


--��ʼ������Ա��ɫ����Ȩ��
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340000','0000000000200020000000004000000');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340000','0000000000200020000000004000001');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340000','0000000000200020000000004000002');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340000','0000000000200020000000004000003');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340000','0000000000200020000000004000004');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340000','0000000000200020000000004000005');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340000','0000000000200020000000004000006');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340000','0000000000200020000000004000007');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340000','0000000000200020000000004000010');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340000','0000000000200020000000004000011');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340000','0000000000200020000000004000012');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340000','0000000000200020000000004000013');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340000','0000000000200020000000004000014');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340000','0000000000200020000000004000015');
--��ʼ����ͨ�û���ɫ����Ȩ��
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340001','0000000000200020000000004000000');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340001','0000000000200020000000004000001');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340001','0000000000200020000000004000002');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340001','0000000000200020000000004000003');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340001','0000000000200020000000004000004');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340001','0000000000200020000000004000005');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340001','0000000000200020000000004000006');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340001','0000000000200020000000004000007');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340001','0000000000200020000000004000011');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340001','0000000000200020000000004000012');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340001','0000000000200020000000004000013');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340001','0000000000200020000000004000014');
insert into EP_R_ROLE_OPERATION (id,role_id,operation_id) values (EP_R_ROLE_OPERATION_SEQ.Nextval,'0000000000900000000000000340001','0000000000200020000000004000015');

commit;