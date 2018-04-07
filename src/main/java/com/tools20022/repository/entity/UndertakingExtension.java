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
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<UndertakingExtension, Undertaking> mmUndertaking = new MMBusinessAssociationEnd<UndertakingExtension, Undertaking>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingExtension.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which extension parameters are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Undertaking.mmUndertakingExtension;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Undertaking.mmObject();
		}

		@Override
		public Undertaking getValue(UndertakingExtension obj) {
			return obj.getUndertaking();
		}

		@Override
		public void setValue(UndertakingExtension obj, Undertaking value) {
			obj.setUndertaking(value);
		}
	};
	protected Max35Text autoExtensionPeriod;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<UndertakingExtension, Max35Text> mmAutoExtensionPeriod = new MMBusinessAttribute<UndertakingExtension, Max35Text>() {
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

		@Override
		public Max35Text getValue(UndertakingExtension obj) {
			return obj.getAutoExtensionPeriod();
		}

		@Override
		public void setValue(UndertakingExtension obj, Max35Text value) {
			obj.setAutoExtensionPeriod(value);
		}
	};
	protected ISODate autoExtensionFinalExpiryDate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<UndertakingExtension, ISODate> mmAutoExtensionFinalExpiryDate = new MMBusinessAttribute<UndertakingExtension, ISODate>() {
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

		@Override
		public ISODate getValue(UndertakingExtension obj) {
			return obj.getAutoExtensionFinalExpiryDate();
		}

		@Override
		public void setValue(UndertakingExtension obj, ISODate value) {
			obj.setAutoExtensionFinalExpiryDate(value);
		}
	};
	protected Number nonExtensionNoticePeriod;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<UndertakingExtension, Number> mmNonExtensionNoticePeriod = new MMBusinessAttribute<UndertakingExtension, Number>() {
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

		@Override
		public Number getValue(UndertakingExtension obj) {
			return obj.getNonExtensionNoticePeriod();
		}

		@Override
		public void setValue(UndertakingExtension obj, Number value) {
			obj.setNonExtensionNoticePeriod(value);
		}
	};
	protected YesNoIndicator nonExtensionIndicator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<UndertakingExtension, YesNoIndicator> mmNonExtensionIndicator = new MMBusinessAttribute<UndertakingExtension, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(UndertakingExtension obj) {
			return obj.getNonExtensionIndicator();
		}

		@Override
		public void setValue(UndertakingExtension obj, YesNoIndicator value) {
			obj.setNonExtensionIndicator(value);
		}
	};
	protected Number autoExtensionNotificationPeriod;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<UndertakingExtension, Number> mmAutoExtensionNotificationPeriod = new MMBusinessAttribute<UndertakingExtension, Number>() {
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

		@Override
		public Number getValue(UndertakingExtension obj) {
			return obj.getAutoExtensionNotificationPeriod();
		}

		@Override
		public void setValue(UndertakingExtension obj, Number value) {
			obj.setAutoExtensionNotificationPeriod(value);
		}
	};
	protected ExternalTypeOfPartyCode notificationRecipientType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<UndertakingExtension, ExternalTypeOfPartyCode> mmNotificationRecipientType = new MMBusinessAttribute<UndertakingExtension, ExternalTypeOfPartyCode>() {
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

		@Override
		public ExternalTypeOfPartyCode getValue(UndertakingExtension obj) {
			return obj.getNotificationRecipientType();
		}

		@Override
		public void setValue(UndertakingExtension obj, ExternalTypeOfPartyCode value) {
			obj.setNotificationRecipientType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingExtension";
				definition = "Specifies information related to the extension of an undertaking.";
				associationDomain_lazy = () -> Arrays.asList(Undertaking.mmUndertakingExtension);
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

	public UndertakingExtension setUndertaking(Undertaking undertaking) {
		this.undertaking = Objects.requireNonNull(undertaking);
		return this;
	}

	public Max35Text getAutoExtensionPeriod() {
		return autoExtensionPeriod;
	}

	public UndertakingExtension setAutoExtensionPeriod(Max35Text autoExtensionPeriod) {
		this.autoExtensionPeriod = Objects.requireNonNull(autoExtensionPeriod);
		return this;
	}

	public ISODate getAutoExtensionFinalExpiryDate() {
		return autoExtensionFinalExpiryDate;
	}

	public UndertakingExtension setAutoExtensionFinalExpiryDate(ISODate autoExtensionFinalExpiryDate) {
		this.autoExtensionFinalExpiryDate = Objects.requireNonNull(autoExtensionFinalExpiryDate);
		return this;
	}

	public Number getNonExtensionNoticePeriod() {
		return nonExtensionNoticePeriod;
	}

	public UndertakingExtension setNonExtensionNoticePeriod(Number nonExtensionNoticePeriod) {
		this.nonExtensionNoticePeriod = Objects.requireNonNull(nonExtensionNoticePeriod);
		return this;
	}

	public YesNoIndicator getNonExtensionIndicator() {
		return nonExtensionIndicator;
	}

	public UndertakingExtension setNonExtensionIndicator(YesNoIndicator nonExtensionIndicator) {
		this.nonExtensionIndicator = Objects.requireNonNull(nonExtensionIndicator);
		return this;
	}

	public Number getAutoExtensionNotificationPeriod() {
		return autoExtensionNotificationPeriod;
	}

	public UndertakingExtension setAutoExtensionNotificationPeriod(Number autoExtensionNotificationPeriod) {
		this.autoExtensionNotificationPeriod = Objects.requireNonNull(autoExtensionNotificationPeriod);
		return this;
	}

	public ExternalTypeOfPartyCode getNotificationRecipientType() {
		return notificationRecipientType;
	}

	public UndertakingExtension setNotificationRecipientType(ExternalTypeOfPartyCode notificationRecipientType) {
		this.notificationRecipientType = Objects.requireNonNull(notificationRecipientType);
		return this;
	}
}