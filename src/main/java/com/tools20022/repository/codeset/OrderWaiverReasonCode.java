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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.OrderWaiverReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies investment fund processes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReasonCode#LateTradeDealing
 * OrderWaiverReasonCode.LateTradeDealing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReasonCode#FrontEndLoadCharge
 * OrderWaiverReasonCode.FrontEndLoadCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReasonCode#BelowMinimumInvestmentAmount
 * OrderWaiverReasonCode.BelowMinimumInvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReasonCode#CutOffDate
 * OrderWaiverReasonCode.CutOffDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReasonCode#CommissionWaiver
 * OrderWaiverReasonCode.CommissionWaiver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReasonCode#GenericWaiver
 * OrderWaiverReasonCode.GenericWaiver}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"LATE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderWaiverReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies investment fund processes."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrderWaiverReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Dealing of the trade is outside the normal limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReasonCode
	 * OrderWaiverReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LATE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateTradeDealing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dealing of the trade is outside the normal limit."</li>
	 * </ul>
	 */
	public static final OrderWaiverReasonCode LateTradeDealing = new OrderWaiverReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateTradeDealing";
			definition = "Dealing of the trade is outside the normal limit.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderWaiverReasonCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Front end load charge differs from PPM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReasonCode
	 * OrderWaiverReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndLoadCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Front end load charge differs from PPM."</li>
	 * </ul>
	 */
	public static final OrderWaiverReasonCode FrontEndLoadCharge = new OrderWaiverReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrontEndLoadCharge";
			definition = "Front end load charge differs from PPM.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderWaiverReasonCode.mmObject();
			codeName = "FEND";
		}
	};
	/**
	 * Amount of subscription is below the minimum initial investment amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReasonCode
	 * OrderWaiverReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BMIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumInvestmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of subscription is below the minimum initial investment amount."</li>
	 * </ul>
	 */
	public static final OrderWaiverReasonCode BelowMinimumInvestmentAmount = new OrderWaiverReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumInvestmentAmount";
			definition = "Amount of subscription is below the minimum initial investment amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderWaiverReasonCode.mmObject();
			codeName = "BMIN";
		}
	};
	/**
	 * Cut off date has been passed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReasonCode
	 * OrderWaiverReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOffDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cut off date has been passed."</li>
	 * </ul>
	 */
	public static final OrderWaiverReasonCode CutOffDate = new OrderWaiverReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutOffDate";
			definition = "Cut off date has been passed.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderWaiverReasonCode.mmObject();
			codeName = "CUTO";
		}
	};
	/**
	 * Standard commission is waived.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReasonCode
	 * OrderWaiverReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionWaiver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standard commission is waived."</li>
	 * </ul>
	 */
	public static final OrderWaiverReasonCode CommissionWaiver = new OrderWaiverReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionWaiver";
			definition = "Standard commission is waived.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderWaiverReasonCode.mmObject();
			codeName = "COMW";
		}
	};
	/**
	 * General waiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReasonCode
	 * OrderWaiverReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WAIV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericWaiver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General waiver."</li>
	 * </ul>
	 */
	public static final OrderWaiverReasonCode GenericWaiver = new OrderWaiverReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericWaiver";
			definition = "General waiver.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderWaiverReasonCode.mmObject();
			codeName = "WAIV";
		}
	};
	final static private LinkedHashMap<String, OrderWaiverReasonCode> codesByName = new LinkedHashMap<>();

	protected OrderWaiverReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("LATE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderWaiverReasonCode";
				definition = "Specifies investment fund processes.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderWaiverReasonCode.LateTradeDealing, com.tools20022.repository.codeset.OrderWaiverReasonCode.FrontEndLoadCharge,
						com.tools20022.repository.codeset.OrderWaiverReasonCode.BelowMinimumInvestmentAmount, com.tools20022.repository.codeset.OrderWaiverReasonCode.CutOffDate,
						com.tools20022.repository.codeset.OrderWaiverReasonCode.CommissionWaiver, com.tools20022.repository.codeset.OrderWaiverReasonCode.GenericWaiver);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LateTradeDealing.getCodeName().get(), LateTradeDealing);
		codesByName.put(FrontEndLoadCharge.getCodeName().get(), FrontEndLoadCharge);
		codesByName.put(BelowMinimumInvestmentAmount.getCodeName().get(), BelowMinimumInvestmentAmount);
		codesByName.put(CutOffDate.getCodeName().get(), CutOffDate);
		codesByName.put(CommissionWaiver.getCodeName().get(), CommissionWaiver);
		codesByName.put(GenericWaiver.getCodeName().get(), GenericWaiver);
	}

	public static OrderWaiverReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrderWaiverReasonCode[] values() {
		OrderWaiverReasonCode[] values = new OrderWaiverReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrderWaiverReasonCode> {
		@Override
		public OrderWaiverReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrderWaiverReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}