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
import com.tools20022.repository.codeset.CardPaymentServiceType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Service provided by the card payment transaction, in addition to the main
 * service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#Aggregation
 * CardPaymentServiceType2Code.mmAggregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#DCC
 * CardPaymentServiceType2Code.mmDCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#Gratuity
 * CardPaymentServiceType2Code.mmGratuity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#Instalment
 * CardPaymentServiceType2Code.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#Loyalty
 * CardPaymentServiceType2Code.mmLoyalty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#NoShow
 * CardPaymentServiceType2Code.mmNoShow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#PurchaseCorporate
 * CardPaymentServiceType2Code.mmPurchaseCorporate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#RecurringPayment
 * CardPaymentServiceType2Code.mmRecurringPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#SolicitedAvailableFunds
 * CardPaymentServiceType2Code.mmSolicitedAvailableFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#UnsolicitedAvailableFunds
 * CardPaymentServiceType2Code.mmUnsolicitedAvailableFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#VoiceAuthorisation
 * CardPaymentServiceType2Code.mmVoiceAuthorisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
 * CardPaymentServiceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AGGR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentServiceType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Service provided by the card payment transaction, in addition to the main service."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardPaymentServiceType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aggregation"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code Aggregation = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Aggregation";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Aggregation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DCC"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code DCC = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DCC";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.DCC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gratuity"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code Gratuity = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gratuity";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Gratuity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instalment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code Instalment = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instalment";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Instalment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loyalty"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code Loyalty = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loyalty";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Loyalty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoShow"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code NoShow = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoShow";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.NoShow.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseCorporate"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code PurchaseCorporate = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseCorporate";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.PurchaseCorporate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurringPayment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code RecurringPayment = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurringPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.RecurringPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitedAvailableFunds"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code SolicitedAvailableFunds = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitedAvailableFunds";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.SolicitedAvailableFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsolicitedAvailableFunds"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code UnsolicitedAvailableFunds = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsolicitedAvailableFunds";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.UnsolicitedAvailableFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoiceAuthorisation"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType2Code VoiceAuthorisation = new CardPaymentServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoiceAuthorisation";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmObject();
			codeName = CardPaymentServiceTypeCode.VoiceAuthorisation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardPaymentServiceType2Code> codesByName = new LinkedHashMap<>();

	protected CardPaymentServiceType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AGGR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentServiceType2Code";
				definition = "Service provided by the card payment transaction, in addition to the main service.";
				trace_lazy = () -> CardPaymentServiceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType2Code.Aggregation, com.tools20022.repository.codeset.CardPaymentServiceType2Code.DCC,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.Gratuity, com.tools20022.repository.codeset.CardPaymentServiceType2Code.Instalment,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.Loyalty, com.tools20022.repository.codeset.CardPaymentServiceType2Code.NoShow,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.PurchaseCorporate, com.tools20022.repository.codeset.CardPaymentServiceType2Code.RecurringPayment,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.SolicitedAvailableFunds, com.tools20022.repository.codeset.CardPaymentServiceType2Code.UnsolicitedAvailableFunds,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.VoiceAuthorisation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Aggregation.getCodeName().get(), Aggregation);
		codesByName.put(DCC.getCodeName().get(), DCC);
		codesByName.put(Gratuity.getCodeName().get(), Gratuity);
		codesByName.put(Instalment.getCodeName().get(), Instalment);
		codesByName.put(Loyalty.getCodeName().get(), Loyalty);
		codesByName.put(NoShow.getCodeName().get(), NoShow);
		codesByName.put(PurchaseCorporate.getCodeName().get(), PurchaseCorporate);
		codesByName.put(RecurringPayment.getCodeName().get(), RecurringPayment);
		codesByName.put(SolicitedAvailableFunds.getCodeName().get(), SolicitedAvailableFunds);
		codesByName.put(UnsolicitedAvailableFunds.getCodeName().get(), UnsolicitedAvailableFunds);
		codesByName.put(VoiceAuthorisation.getCodeName().get(), VoiceAuthorisation);
	}

	public static CardPaymentServiceType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardPaymentServiceType2Code[] values() {
		CardPaymentServiceType2Code[] values = new CardPaymentServiceType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardPaymentServiceType2Code> {
		@Override
		public CardPaymentServiceType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardPaymentServiceType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}