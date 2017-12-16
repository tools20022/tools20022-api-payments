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
import com.tools20022.repository.codeset.CorporateActionReversalReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * The reason why a reversal of payment is taking place in corporate action
 * processing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode#DayCountBasisDifference
 * CorporateActionReversalReasonCode.mmDayCountBasisDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode#IncorrectValueDate
 * CorporateActionReversalReasonCode.mmIncorrectValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode#IncorrectRecordDate
 * CorporateActionReversalReasonCode.mmIncorrectRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode#IncorrectPrice
 * CorporateActionReversalReasonCode.mmIncorrectPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode#UnduePayment
 * CorporateActionReversalReasonCode.mmUnduePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode#IncorrectEventLevelTaxRate
 * CorporateActionReversalReasonCode.mmIncorrectEventLevelTaxRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode#FundsNotReceived
 * CorporateActionReversalReasonCode.mmFundsNotReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode#PaymentOutsideClearingSystem
 * CorporateActionReversalReasonCode.mmPaymentOutsideClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode#IncorrectPaymentCurrency
 * CorporateActionReversalReasonCode.mmIncorrectPaymentCurrency}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DCBD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionReversalReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The reason why a reversal of payment is taking place in corporate action processing."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionReversalReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Difference in day count basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode
	 * CorporateActionReversalReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCBD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayCountBasisDifference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Difference in day count basis."</li>
	 * </ul>
	 */
	public static final CorporateActionReversalReasonCode DayCountBasisDifference = new CorporateActionReversalReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DayCountBasisDifference";
			definition = "Difference in day count basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReversalReasonCode.mmObject();
			codeName = "DCBD";
		}
	};
	/**
	 * Value date is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode
	 * CorporateActionReversalReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IVAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value date is incorrect."</li>
	 * </ul>
	 */
	public static final CorporateActionReversalReasonCode IncorrectValueDate = new CorporateActionReversalReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectValueDate";
			definition = "Value date is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReversalReasonCode.mmObject();
			codeName = "IVAD";
		}
	};
	/**
	 * Record date is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode
	 * CorporateActionReversalReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IRED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record date is incorrect."</li>
	 * </ul>
	 */
	public static final CorporateActionReversalReasonCode IncorrectRecordDate = new CorporateActionReversalReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectRecordDate";
			definition = "Record date is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReversalReasonCode.mmObject();
			codeName = "IRED";
		}
	};
	/**
	 * Price is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode
	 * CorporateActionReversalReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is incorrect."</li>
	 * </ul>
	 */
	public static final CorporateActionReversalReasonCode IncorrectPrice = new CorporateActionReversalReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectPrice";
			definition = "Price is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReversalReasonCode.mmObject();
			codeName = "IPRI";
		}
	};
	/**
	 * Payment is not due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode
	 * CorporateActionReversalReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UPAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnduePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment is not due."</li>
	 * </ul>
	 */
	public static final CorporateActionReversalReasonCode UnduePayment = new CorporateActionReversalReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnduePayment";
			definition = "Payment is not due.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReversalReasonCode.mmObject();
			codeName = "UPAY";
		}
	};
	/**
	 * Event level tax rate is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode
	 * CorporateActionReversalReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IETR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectEventLevelTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event level tax rate is incorrect."</li>
	 * </ul>
	 */
	public static final CorporateActionReversalReasonCode IncorrectEventLevelTaxRate = new CorporateActionReversalReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectEventLevelTaxRate";
			definition = "Event level tax rate is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReversalReasonCode.mmObject();
			codeName = "IETR";
		}
	};
	/**
	 * Funds have not been received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode
	 * CorporateActionReversalReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FNRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsNotReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Funds have not been received."</li>
	 * </ul>
	 */
	public static final CorporateActionReversalReasonCode FundsNotReceived = new CorporateActionReversalReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundsNotReceived";
			definition = "Funds have not been received.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReversalReasonCode.mmObject();
			codeName = "FNRC";
		}
	};
	/**
	 * Payment will occur outside of clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode
	 * CorporateActionReversalReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOutsideClearingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment will occur outside of clearing system."</li>
	 * </ul>
	 */
	public static final CorporateActionReversalReasonCode PaymentOutsideClearingSystem = new CorporateActionReversalReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentOutsideClearingSystem";
			definition = "Payment will occur outside of clearing system.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReversalReasonCode.mmObject();
			codeName = "POCS";
		}
	};
	/**
	 * Payment currency is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode
	 * CorporateActionReversalReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPCU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPaymentCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment currency is incorrect."</li>
	 * </ul>
	 */
	public static final CorporateActionReversalReasonCode IncorrectPaymentCurrency = new CorporateActionReversalReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectPaymentCurrency";
			definition = "Payment currency is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReversalReasonCode.mmObject();
			codeName = "IPCU";
		}
	};
	final static private LinkedHashMap<String, CorporateActionReversalReasonCode> codesByName = new LinkedHashMap<>();

	protected CorporateActionReversalReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DCBD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionReversalReasonCode";
				definition = "The reason why a reversal of payment is taking place in corporate action processing.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionReversalReasonCode.DayCountBasisDifference, com.tools20022.repository.codeset.CorporateActionReversalReasonCode.IncorrectValueDate,
						com.tools20022.repository.codeset.CorporateActionReversalReasonCode.IncorrectRecordDate, com.tools20022.repository.codeset.CorporateActionReversalReasonCode.IncorrectPrice,
						com.tools20022.repository.codeset.CorporateActionReversalReasonCode.UnduePayment, com.tools20022.repository.codeset.CorporateActionReversalReasonCode.IncorrectEventLevelTaxRate,
						com.tools20022.repository.codeset.CorporateActionReversalReasonCode.FundsNotReceived, com.tools20022.repository.codeset.CorporateActionReversalReasonCode.PaymentOutsideClearingSystem,
						com.tools20022.repository.codeset.CorporateActionReversalReasonCode.IncorrectPaymentCurrency);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DayCountBasisDifference.getCodeName().get(), DayCountBasisDifference);
		codesByName.put(IncorrectValueDate.getCodeName().get(), IncorrectValueDate);
		codesByName.put(IncorrectRecordDate.getCodeName().get(), IncorrectRecordDate);
		codesByName.put(IncorrectPrice.getCodeName().get(), IncorrectPrice);
		codesByName.put(UnduePayment.getCodeName().get(), UnduePayment);
		codesByName.put(IncorrectEventLevelTaxRate.getCodeName().get(), IncorrectEventLevelTaxRate);
		codesByName.put(FundsNotReceived.getCodeName().get(), FundsNotReceived);
		codesByName.put(PaymentOutsideClearingSystem.getCodeName().get(), PaymentOutsideClearingSystem);
		codesByName.put(IncorrectPaymentCurrency.getCodeName().get(), IncorrectPaymentCurrency);
	}

	public static CorporateActionReversalReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionReversalReasonCode[] values() {
		CorporateActionReversalReasonCode[] values = new CorporateActionReversalReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionReversalReasonCode> {
		@Override
		public CorporateActionReversalReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionReversalReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}