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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02;
import com.tools20022.repository.area.acmt.AccountClosingRequestV02;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.AccountContract;
import com.tools20022.repository.entity.CashAccountContract;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies target dates dates related to account opening and closing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountContract4#mmTargetClosingDate
 * AccountContract4.mmTargetClosingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountContract4#mmUrgencyFlag
 * AccountContract4.mmUrgencyFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountContract4#mmRemovalIndicator
 * AccountContract4.mmRemovalIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccountContract
 * CashAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02#mmContractDates
 * AccountClosingAmendmentRequestV02.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV02#mmContractDates
 * AccountClosingRequestV02.mmContractDates}</li>
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
 * "AccountContract4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies target dates dates related to account opening and closing."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountContract4", propOrder = {"targetClosingDate", "urgencyFlag", "removalIndicator"})
public class AccountContract4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TrgtClsgDt")
	protected ISODate targetClosingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmTargetClosingDate
	 * AccountContract.mmTargetClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract4
	 * AccountContract4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrgtClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related services are expected to cease to be operational for the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTargetClosingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountContract.mmTargetClosingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountContract4.mmObject();
			isDerived = false;
			xmlTag = "TrgtClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetClosingDate";
			definition = "Date on which the account and related services are expected to cease to be operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "UrgcyFlg")
	protected YesNoIndicator urgencyFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmUrgencyFlag
	 * AccountContract.mmUrgencyFlag}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract4
	 * AccountContract4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UrgcyFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UrgencyFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator that the account opening/maintenance/closing process needs to be treated urgently, that is, sooner than the terms established by the service level agreed between the account holder customer and the account servicing institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUrgencyFlag = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountContract.mmUrgencyFlag;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountContract4.mmObject();
			isDerived = false;
			xmlTag = "UrgcyFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UrgencyFlag";
			definition = "Indicator that the account opening/maintenance/closing process needs to be treated urgently, that is, sooner than the terms established by the service level agreed between the account holder customer and the account servicing institution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "RmvlInd")
	protected YesNoIndicator removalIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmRemovalIndicator
	 * AccountContract.mmRemovalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract4
	 * AccountContract4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmvlInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemovalIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates removal of the account. After removal, an account will not appear anymore in reports."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemovalIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountContract.mmRemovalIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountContract4.mmObject();
			isDerived = false;
			xmlTag = "RmvlInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemovalIndicator";
			definition = "Indicates removal of the account. After removal, an account will not appear anymore in reports.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountContract4.mmTargetClosingDate, com.tools20022.repository.msg.AccountContract4.mmUrgencyFlag,
						com.tools20022.repository.msg.AccountContract4.mmRemovalIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountClosingAmendmentRequestV02.mmContractDates, AccountClosingRequestV02.mmContractDates);
				trace_lazy = () -> CashAccountContract.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountContract4";
				definition = "Specifies target dates dates related to account opening and closing.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODate> getTargetClosingDate() {
		return targetClosingDate == null ? Optional.empty() : Optional.of(targetClosingDate);
	}

	public AccountContract4 setTargetClosingDate(ISODate targetClosingDate) {
		this.targetClosingDate = targetClosingDate;
		return this;
	}

	public Optional<YesNoIndicator> getUrgencyFlag() {
		return urgencyFlag == null ? Optional.empty() : Optional.of(urgencyFlag);
	}

	public AccountContract4 setUrgencyFlag(YesNoIndicator urgencyFlag) {
		this.urgencyFlag = urgencyFlag;
		return this;
	}

	public Optional<YesNoIndicator> getRemovalIndicator() {
		return removalIndicator == null ? Optional.empty() : Optional.of(removalIndicator);
	}

	public AccountContract4 setRemovalIndicator(YesNoIndicator removalIndicator) {
		this.removalIndicator = removalIndicator;
		return this;
	}
}