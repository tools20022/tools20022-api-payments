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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CashAccountContract;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies target and actual dates dates related to account opening and
 * closing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountContract3#TargetGoLiveDate
 * AccountContract3.TargetGoLiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountContract3#TargetClosingDate
 * AccountContract3.TargetClosingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountContract3#GoLiveDate
 * AccountContract3.GoLiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountContract3#ClosingDate
 * AccountContract3.ClosingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountContract3#UrgencyFlag
 * AccountContract3.UrgencyFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountContract3#RemovalIndicator
 * AccountContract3.RemovalIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccountContract
 * CashAccountContract}</li>
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
 * "AccountContract3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies target and actual dates dates related to account opening and closing."
 * </li>
 * </ul>
 */
public class AccountContract3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date on which the account and related basic services are expected to be
	 * operational for the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#TargetGoLiveDate
	 * AccountContract.TargetGoLiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract3
	 * AccountContract3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrgtGoLiveDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetGoLiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related basic services  are expected to be operational for the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TargetGoLiveDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountContract3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AccountContract.TargetGoLiveDate;
			isDerived = false;
			xmlTag = "TrgtGoLiveDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetGoLiveDate";
			definition = "Date on which the account and related basic services  are expected to be operational for the account owner.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date on which the account and related services are expected to cease to
	 * be operational for the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#TargetClosingDate
	 * AccountContract.TargetClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract3
	 * AccountContract3}</li>
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
	public static final MMMessageAttribute TargetClosingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountContract3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AccountContract.TargetClosingDate;
			isDerived = false;
			xmlTag = "TrgtClsgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetClosingDate";
			definition = "Date on which the account and related services are expected to cease to be operational for the account owner.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date on which the account and related basic services are effectively
	 * operational for the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#LiveDate
	 * Account.LiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract3
	 * AccountContract3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GoLiveDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoLiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related basic services are effectively operational for the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute GoLiveDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountContract3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Account.LiveDate;
			isDerived = false;
			xmlTag = "GoLiveDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoLiveDate";
			definition = "Date on which the account and related basic services are effectively operational for the account owner.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date on which the account and related services cease effectively to be
	 * operational for the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#ClosingDate
	 * Account.ClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract3
	 * AccountContract3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related services cease effectively to be operational for the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ClosingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountContract3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Account.ClosingDate;
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Date on which the account and related services cease effectively to be operational for the account owner.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Indicator that the account opening/maintenance/closing process needs to
	 * be treated urgently, that is, sooner than the terms established by the
	 * service level agreed between the account holder customer and the account
	 * servicing institution.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.AccountContract#UrgencyFlag
	 * AccountContract.UrgencyFlag}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract3
	 * AccountContract3}</li>
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
	public static final MMMessageAttribute UrgencyFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountContract3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AccountContract.UrgencyFlag;
			isDerived = false;
			xmlTag = "UrgcyFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UrgencyFlag";
			definition = "Indicator that the account opening/maintenance/closing process needs to be treated urgently, that is, sooner than the terms established by the service level agreed between the account holder customer and the account servicing institution.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates removal of the account. After removal, an account will not
	 * appear anymore in reports.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.AccountContract#RemovalIndicator
	 * AccountContract.RemovalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract3
	 * AccountContract3}</li>
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
	public static final MMMessageAttribute RemovalIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountContract3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AccountContract.RemovalIndicator;
			isDerived = false;
			xmlTag = "RmvlInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemovalIndicator";
			definition = "Indicates removal of the account. After removal, an account will not appear anymore in reports.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountContract3.TargetGoLiveDate, com.tools20022.repository.msg.AccountContract3.TargetClosingDate,
						com.tools20022.repository.msg.AccountContract3.GoLiveDate, com.tools20022.repository.msg.AccountContract3.ClosingDate, com.tools20022.repository.msg.AccountContract3.UrgencyFlag,
						com.tools20022.repository.msg.AccountContract3.RemovalIndicator);
				trace_lazy = () -> CashAccountContract.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountContract3";
				definition = "Specifies target and actual dates dates related to account opening and closing.";
			}
		});
		return mmObject_lazy.get();
	}
}