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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of reading of the card data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CardDataReadingCode#mmTag
 * CardDataReadingCode.mmTag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#mmPhysical
 * CardDataReadingCode.mmPhysical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#mmBarCode
 * CardDataReadingCode.mmBarCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#mmMagneticStripe
 * CardDataReadingCode.mmMagneticStripe}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CardDataReadingCode#mmICC
 * CardDataReadingCode.mmICC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#mmAccountData
 * CardDataReadingCode.mmAccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#mmProximityReader
 * CardDataReadingCode.mmProximityReader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#mmEMVProximityReader
 * CardDataReadingCode.mmEMVProximityReader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#mmCardOnFile
 * CardDataReadingCode.mmCardOnFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode#mmUnknown
 * CardDataReadingCode.mmUnknown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CardDataReading1Code
 * CardDataReading1Code}</li>
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
 * <li>"TAGC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardDataReadingCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of reading of the card data."</li>
 * </ul>
 */
public class CardDataReadingCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tag reading capabilities (RFID, etc.).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAGC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tag reading capabilities (RFID, etc.)."</li>
	 * </ul>
	 */
	public static final MMCode mmTag = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tag";
			definition = "Tag reading capabilities (RFID, etc.).";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "TAGC";
		}
	};
	/**
	 * Keyboard entry or OCR reading of embossing or printed data, either at
	 * time of transaction or after the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPhysical = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Physical";
			definition = "Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Bar code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BarCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bar code."</li>
	 * </ul>
	 */
	public static final MMCode mmBarCode = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BarCode";
			definition = "Bar code.";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "BRCD";
		}
	};
	/**
	 * Magnetic stripe.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MGST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MagneticStripe"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Magnetic stripe."</li>
	 * </ul>
	 */
	public static final MMCode mmMagneticStripe = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MagneticStripe";
			definition = "Magnetic stripe.";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "MGST";
		}
	};
	/**
	 * ICC (Integrated Circuit Card) with contact containing software
	 * applications conform to ISO 7816.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CICC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ICC  (Integrated Circuit Card) with contact containing software applications conform to ISO 7816."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmICC = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ICC";
			definition = "ICC  (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "CICC";
		}
	};
	/**
	 * Account data on file.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account data on file."</li>
	 * </ul>
	 */
	public static final MMCode mmAccountData = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountData";
			definition = "Account data on file.";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "DFLE";
		}
	};
	/**
	 * Contactless proximity reader.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTLS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProximityReader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contactless proximity reader."</li>
	 * </ul>
	 */
	public static final MMCode mmProximityReader = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProximityReader";
			definition = "Contactless proximity reader.";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "CTLS";
		}
	};
	/**
	 * Contactless proximity reader, with application conform to the standard
	 * EMV (standard initiated by Europay, Mastercard and Visa).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECTL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVProximityReader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEMVProximityReader = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EMVProximityReader";
			definition = "Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "ECTL";
		}
	};
	/**
	 * Card information are stored on a file.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDFL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardOnFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card information are stored on a file."</li>
	 * </ul>
	 */
	public static final MMCode mmCardOnFile = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardOnFile";
			definition = "Card information are stored on a file.";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "CDFL";
		}
	};
	/**
	 * Unknown card reading capability.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNKW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unknown card reading capability."</li>
	 * </ul>
	 */
	public static final MMCode mmUnknown = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			definition = "Unknown card reading capability.";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "UNKW";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("TAGC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardDataReadingCode";
				definition = "Type of reading of the card data.";
				code_lazy = () -> Arrays.asList(CardDataReadingCode.mmTag, CardDataReadingCode.mmPhysical, CardDataReadingCode.mmBarCode, CardDataReadingCode.mmMagneticStripe, CardDataReadingCode.mmICC, CardDataReadingCode.mmAccountData,
						CardDataReadingCode.mmProximityReader, CardDataReadingCode.mmEMVProximityReader, CardDataReadingCode.mmCardOnFile, CardDataReadingCode.mmUnknown);
				derivation_lazy = () -> Arrays.asList(CardDataReading1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}