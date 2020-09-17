CREATE TABLE real_time_data (
	id uuid NOT NULL,
	close numeric(19,2) NULL,
	high numeric(19,2) NULL,
	low numeric(19,2) NULL,
	open numeric(19,2) NULL,
	open_interest int4 NULL,
	quotation_lot int4 NULL,
	trade_qty int4 NULL,
	last_trade_time timestamp NULL,

	CONSTRAINT real_time_data_pkey PRIMARY KEY (id)

);