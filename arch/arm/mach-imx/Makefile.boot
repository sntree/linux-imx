zreladdr-$(CONFIG_SOC_IMX1)	+= 0x08008000
params_phys-$(CONFIG_SOC_IMX1)	:= 0x08000100
initrd_phys-$(CONFIG_SOC_IMX1)	:= 0x08800000

zreladdr-$(CONFIG_SOC_IMX21)	+= 0xC0008000
params_phys-$(CONFIG_SOC_IMX21)	:= 0xC0000100
initrd_phys-$(CONFIG_SOC_IMX21)	:= 0xC0800000

zreladdr-$(CONFIG_SOC_IMX25)	+= 0x80008000
params_phys-$(CONFIG_SOC_IMX25)	:= 0x80000100
initrd_phys-$(CONFIG_SOC_IMX25)	:= 0x80800000

zreladdr-$(CONFIG_SOC_IMX27)	+= 0xA0008000
params_phys-$(CONFIG_SOC_IMX27)	:= 0xA0000100
initrd_phys-$(CONFIG_SOC_IMX27)	:= 0xA0800000

zreladdr-$(CONFIG_SOC_IMX31)	+= 0x80008000
params_phys-$(CONFIG_SOC_IMX31)	:= 0x80000100
initrd_phys-$(CONFIG_SOC_IMX31)	:= 0x80800000

zreladdr-$(CONFIG_SOC_IMX35)	+= 0x80008000
params_phys-$(CONFIG_SOC_IMX35)	:= 0x80000100
initrd_phys-$(CONFIG_SOC_IMX35)	:= 0x80800000

zreladdr-$(CONFIG_SOC_IMX6Q)	+= 0x10008000
params_phys-$(CONFIG_SOC_IMX6Q)	:= 0x10000100
initrd_phys-$(CONFIG_SOC_IMX6Q)	:= 0x10800000

dtb-$(CONFIG_SOC_IMX6Q)	+= imx6q-arm2.dtb \
			   imx6q-sabrelite.dtb
