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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.BalanceTransferWindowCode;
import com.tools20022.repository.codeset.SwitchStatusCode;
import com.tools20022.repository.codeset.SwitchTypeCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CashAccountService;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AccountSwitchDetails1;
import com.tools20022.repository.msg.Frequency1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * The Account Switch Service support the guaranteed switch of a customer’s
 * account and the transfer of payments arrangements associated with the account
 * from one payment institution to another payment institution.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountSwitching" src="doc-files/AccountSwitching.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.CashAccountService
 * CashAccountService}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountSwitching#mmSwitchReceivedDateTime
 * AccountSwitching.mmSwitchReceivedDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountSwitching#mmSwitchDate
 * AccountSwitching.mmSwitchDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountSwitching#mmSwitchStatus
 * AccountSwitching.mmSwitchStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountSwitching#mmUniqueReferenceNumber
 * AccountSwitching.mmUniqueReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountSwitching#mmSwitchType
 * AccountSwitching.mmSwitchType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountSwitching#mmBalanceTransferWindow
 * AccountSwitching.mmBalanceTransferWindow}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSwitchDetails1
 * AccountSwitchDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Frequency1 Frequency1}</li>
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
 * "AccountSwitching"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The Account Switch Service support the guaranteed switch of a customer’s account and the transfer of payments arrangements associated with the account from one payment institution to another payment institution."
 * </li>
 * </ul>
 */
public class AccountSwitching extends CashAccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime switchReceivedDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1#mmSwitchReceivedDateTime
	 * AccountSwitchDetails1.mmSwitchReceivedDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountSwitching
	 * AccountSwitching}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchReceivedDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time that the request was received by the central switch service."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountSwitching, ISODateTime> mmSwitchReceivedDateTime = new MMBusinessAttribute<AccountSwitching, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountSwitchDetails1.mmSwitchReceivedDateTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountSwitching.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SwitchReceivedDateTime";
			definition = "Date and time that the request was received by the central switch service.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(AccountSwitching obj) {
			return obj.getSwitchReceivedDateTime();
		}

		@Override
		public void setValue(AccountSwitching obj, ISODateTime value) {
			obj.setSwitchReceivedDateTime(value);
		}
	};
	protected ISODate switchDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1#mmSwitchDate
	 * AccountSwitchDetails1.mmSwitchDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Frequency1#mmStartDate
	 * Frequency1.mmStartDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountSwitching
	 * AccountSwitching}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account switch is expected to have completed. The value is the same as the targeted switch date if the switch completes in the expected timeline."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountSwitching, ISODate> mmSwitchDate = new MMBusinessAttribute<AccountSwitching, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountSwitchDetails1.mmSwitchDate, Frequency1.mmStartDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountSwitching.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SwitchDate";
			definition = "Date on which the account switch is expected to have completed. The value is the same as the targeted switch date if the switch completes in the expected timeline.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(AccountSwitching obj) {
			return obj.getSwitchDate();
		}

		@Override
		public void setValue(AccountSwitching obj, ISODate value) {
			obj.setSwitchDate(value);
		}
	};
	protected SwitchStatusCode switchStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchStatusCode
	 * SwitchStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1#mmSwitchStatus
	 * AccountSwitchDetails1.mmSwitchStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountSwitching
	 * AccountSwitching}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "State of the account switch at the time the message is sent."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountSwitching, SwitchStatusCode> mmSwitchStatus = new MMBusinessAttribute<AccountSwitching, SwitchStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountSwitchDetails1.mmSwitchStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountSwitching.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SwitchStatus";
			definition = "State of the account switch at the time the message is sent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SwitchStatusCode.mmObject();
		}

		@Override
		public SwitchStatusCode getValue(AccountSwitching obj) {
			return obj.getSwitchStatus();
		}

		@Override
		public void setValue(AccountSwitching obj, SwitchStatusCode value) {
			obj.setSwitchStatus(value);
		}
	};
	protected Max35Text uniqueReferenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1#mmUniqueReferenceNumber
	 * AccountSwitchDetails1.mmUniqueReferenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1#mmRoutingUniqueReferenceNumber
	 * AccountSwitchDetails1.mmRoutingUniqueReferenceNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountSwitching
	 * AccountSwitching}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniqueReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique number that provides unique and unambiguous identification of the account switch. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountSwitching, Max35Text> mmUniqueReferenceNumber = new MMBusinessAttribute<AccountSwitching, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountSwitchDetails1.mmUniqueReferenceNumber, AccountSwitchDetails1.mmRoutingUniqueReferenceNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountSwitching.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UniqueReferenceNumber";
			definition = "Unique number that provides unique and unambiguous identification of the account switch. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AccountSwitching obj) {
			return obj.getUniqueReferenceNumber();
		}

		@Override
		public void setValue(AccountSwitching obj, Max35Text value) {
			obj.setUniqueReferenceNumber(value);
		}
	};
	protected SwitchTypeCode switchType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SwitchTypeCode
	 * SwitchTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1#mmSwitchType
	 * AccountSwitchDetails1.mmSwitchType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountSwitching
	 * AccountSwitching}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the account switch is a full switch or a partial switch."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountSwitching, SwitchTypeCode> mmSwitchType = new MMBusinessAttribute<AccountSwitching, SwitchTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountSwitchDetails1.mmSwitchType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountSwitching.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SwitchType";
			definition = "Indicates whether the account switch is a full switch or a partial switch.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SwitchTypeCode.mmObject();
		}

		@Override
		public SwitchTypeCode getValue(AccountSwitching obj) {
			return obj.getSwitchType();
		}

		@Override
		public void setValue(AccountSwitching obj, SwitchTypeCode value) {
			obj.setSwitchType(value);
		}
	};
	protected BalanceTransferWindowCode balanceTransferWindow;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceTransferWindowCode
	 * BalanceTransferWindowCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1#mmBalanceTransferWindow
	 * AccountSwitchDetails1.mmBalanceTransferWindow}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountSwitching
	 * AccountSwitching}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTransferWindow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the processing window in which the balance transfer will be processed on the day of the account switch."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountSwitching, BalanceTransferWindowCode> mmBalanceTransferWindow = new MMBusinessAttribute<AccountSwitching, BalanceTransferWindowCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountSwitchDetails1.mmBalanceTransferWindow);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountSwitching.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BalanceTransferWindow";
			definition = "Identifies the processing window in which the balance transfer will be processed on the day of the account switch.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BalanceTransferWindowCode.mmObject();
		}

		@Override
		public BalanceTransferWindowCode getValue(AccountSwitching obj) {
			return obj.getBalanceTransferWindow();
		}

		@Override
		public void setValue(AccountSwitching obj, BalanceTransferWindowCode value) {
			obj.setBalanceTransferWindow(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountSwitching";
				definition = "The Account Switch Service support the guaranteed switch of a customer’s account and the transfer of payments arrangements associated with the account from one payment institution to another payment institution.";
				superType_lazy = () -> CashAccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountSwitching.mmSwitchReceivedDateTime, com.tools20022.repository.entity.AccountSwitching.mmSwitchDate,
						com.tools20022.repository.entity.AccountSwitching.mmSwitchStatus, com.tools20022.repository.entity.AccountSwitching.mmUniqueReferenceNumber, com.tools20022.repository.entity.AccountSwitching.mmSwitchType,
						com.tools20022.repository.entity.AccountSwitching.mmBalanceTransferWindow);
				derivationComponent_lazy = () -> Arrays.asList(AccountSwitchDetails1.mmObject(), Frequency1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountSwitching.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getSwitchReceivedDateTime() {
		return switchReceivedDateTime;
	}

	public AccountSwitching setSwitchReceivedDateTime(ISODateTime switchReceivedDateTime) {
		this.switchReceivedDateTime = Objects.requireNonNull(switchReceivedDateTime);
		return this;
	}

	public ISODate getSwitchDate() {
		return switchDate;
	}

	public AccountSwitching setSwitchDate(ISODate switchDate) {
		this.switchDate = Objects.requireNonNull(switchDate);
		return this;
	}

	public SwitchStatusCode getSwitchStatus() {
		return switchStatus;
	}

	public AccountSwitching setSwitchStatus(SwitchStatusCode switchStatus) {
		this.switchStatus = Objects.requireNonNull(switchStatus);
		return this;
	}

	public Max35Text getUniqueReferenceNumber() {
		return uniqueReferenceNumber;
	}

	public AccountSwitching setUniqueReferenceNumber(Max35Text uniqueReferenceNumber) {
		this.uniqueReferenceNumber = Objects.requireNonNull(uniqueReferenceNumber);
		return this;
	}

	public SwitchTypeCode getSwitchType() {
		return switchType;
	}

	public AccountSwitching setSwitchType(SwitchTypeCode switchType) {
		this.switchType = Objects.requireNonNull(switchType);
		return this;
	}

	public BalanceTransferWindowCode getBalanceTransferWindow() {
		return balanceTransferWindow;
	}

	public AccountSwitching setBalanceTransferWindow(BalanceTransferWindowCode balanceTransferWindow) {
		this.balanceTransferWindow = Objects.requireNonNull(balanceTransferWindow);
		return this;
	}
}