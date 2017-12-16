/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.ExternalTypeOfPartyCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies information related to the extension of an undertaking.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="UndertakingExtension" src="doc-files/UndertakingExtension.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingExtension#mmUndertaking
 * UndertakingExtension.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingExtension#mmAutoExtensionPeriod
 * UndertakingExtension.mmAutoExtensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingExtension#mmAutoExtensionFinalExpiryDate
 * UndertakingExtension.mmAutoExtensionFinalExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingExtension#mmNonExtensionNoticePeriod
 * UndertakingExtension.mmNonExtensionNoticePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingExtension#mmNonExtensionIndicator
 * UndertakingExtension.mmNonExtensionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingExtension#mmAutoExtensionNotificationPeriod
 * UndertakingExtension.mmAutoExtensionNotificationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingExtension#mmNotificationRecipientType
 * UndertakingExtension.mmNotificationRecipientType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingExtension
 * Undertaking.mmUndertakingExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingExtension"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies information related to the extension of an undertaking."</li>
 * </ul>
 */
public class UndertakingExtension {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Undertaking undertaking;
	/**
	 * Undertaking for which extension parameters are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingExtension
	 * Undertaking.mmUndertakingExtension}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingExtension
	 * UndertakingExtension}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking for which extension parameters are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUndertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingExtension.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which extension parameters are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.mmUndertakingExtension;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	protected Max35Text autoExtensionPeriod;
	/**
	 * Requirement for a clause covering an automatic extension of the validity
	 * expiry date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingExtension
	 * UndertakingExtension}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoExtensionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requirement for a clause covering an automatic extension of the validity expiry date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAutoExtensionPeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingExtension.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AutoExtensionPeriod";
			definition = "Requirement for a clause covering an automatic extension of the validity expiry date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingExtension.class.getMethod("getAutoExtensionPeriod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate autoExtensionFinalExpiryDate;
	/**
	 * Date after which the undertaking will no longer be subject to automatic
	 * extension.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingExtension
	 * UndertakingExtension}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoExtensionFinalExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date after which the undertaking will no longer be subject to automatic extension."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAutoExtensionFinalExpiryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingExtension.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AutoExtensionFinalExpiryDate";
			definition = "Date after which the undertaking will no longer be subject to automatic extension.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingExtension.class.getMethod("getAutoExtensionFinalExpiryDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number nonExtensionNoticePeriod;
	/**
	 * Minimum number of days of advance notification that must be given to
	 * indicate the undertaking will no longer be extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingExtension
	 * UndertakingExtension}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonExtensionNoticePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of days of advance notification that must be given to indicate the undertaking  will no longer be extended. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNonExtensionNoticePeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingExtension.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonExtensionNoticePeriod";
			definition = "Minimum number of days of advance notification that must be given to indicate the undertaking  will no longer be extended. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingExtension.class.getMethod("getNonExtensionNoticePeriod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator nonExtensionIndicator;
	/**
	 * Indicates whether the undertaking can be extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingExtension
	 * UndertakingExtension}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonExtensionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the undertaking can be extended."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNonExtensionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingExtension.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonExtensionIndicator";
			definition = "Indicates whether the undertaking can be extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingExtension.class.getMethod("getNonExtensionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number autoExtensionNotificationPeriod;
	/**
	 * Minimum number of days of advance notification given to indicate the
	 * undertaking will no longer be automatically extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingExtension
	 * UndertakingExtension}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoExtensionNotificationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of days of advance notification given to indicate the undertaking will no longer be automatically extended. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAutoExtensionNotificationPeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingExtension.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoExtensionNotificationPeriod";
			definition = "Minimum number of days of advance notification given to indicate the undertaking will no longer be automatically extended. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingExtension.class.getMethod("getAutoExtensionNotificationPeriod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExternalTypeOfPartyCode notificationRecipientType;
	/**
	 * Type of party to whom the notice of non-extension is intended to be
	 * delivered, such as the applicant or beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalTypeOfPartyCode
	 * ExternalTypeOfPartyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingExtension
	 * UndertakingExtension}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationRecipientType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of party to whom the notice of non-extension is intended to be delivered, such as the applicant or beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNotificationRecipientType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingExtension.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationRecipientType";
			definition = "Type of party to whom the notice of non-extension is intended to be delivered, such as the applicant or beneficiary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalTypeOfPartyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingExtension.class.getMethod("getNotificationRecipientType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingExtension";
				definition = "Specifies information related to the extension of an undertaking.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.mmUndertakingExtension);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingExtension.mmUndertaking, com.tools20022.repository.entity.UndertakingExtension.mmAutoExtensionPeriod,
						com.tools20022.repository.entity.UndertakingExtension.mmAutoExtensionFinalExpiryDate, com.tools20022.repository.entity.UndertakingExtension.mmNonExtensionNoticePeriod,
						com.tools20022.repository.entity.UndertakingExtension.mmNonExtensionIndicator, com.tools20022.repository.entity.UndertakingExtension.mmAutoExtensionNotificationPeriod,
						com.tools20022.repository.entity.UndertakingExtension.mmNotificationRecipientType);
			}

			@Override
			public Class<?> getInstanceClass() {
				return UndertakingExtension.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Undertaking getUndertaking() {
		return undertaking;
	}

	public void setUndertaking(com.tools20022.repository.entity.Undertaking undertaking) {
		this.undertaking = undertaking;
	}

	public Max35Text getAutoExtensionPeriod() {
		return autoExtensionPeriod;
	}

	public void setAutoExtensionPeriod(Max35Text autoExtensionPeriod) {
		this.autoExtensionPeriod = autoExtensionPeriod;
	}

	public ISODate getAutoExtensionFinalExpiryDate() {
		return autoExtensionFinalExpiryDate;
	}

	public void setAutoExtensionFinalExpiryDate(ISODate autoExtensionFinalExpiryDate) {
		this.autoExtensionFinalExpiryDate = autoExtensionFinalExpiryDate;
	}

	public Number getNonExtensionNoticePeriod() {
		return nonExtensionNoticePeriod;
	}

	public void setNonExtensionNoticePeriod(Number nonExtensionNoticePeriod) {
		this.nonExtensionNoticePeriod = nonExtensionNoticePeriod;
	}

	public YesNoIndicator getNonExtensionIndicator() {
		return nonExtensionIndicator;
	}

	public void setNonExtensionIndicator(YesNoIndicator nonExtensionIndicator) {
		this.nonExtensionIndicator = nonExtensionIndicator;
	}

	public Number getAutoExtensionNotificationPeriod() {
		return autoExtensionNotificationPeriod;
	}

	public void setAutoExtensionNotificationPeriod(Number autoExtensionNotificationPeriod) {
		this.autoExtensionNotificationPeriod = autoExtensionNotificationPeriod;
	}

	public ExternalTypeOfPartyCode getNotificationRecipientType() {
		return notificationRecipientType;
	}

	public void setNotificationRecipientType(ExternalTypeOfPartyCode notificationRecipientType) {
		this.notificationRecipientType = notificationRecipientType;
	}
}